/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.controller;

import com.bony.bean.LoginFormBean;
import com.bony.dao.CustomerService;
import com.bony.entity.Tablecustomers;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */

@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    CustomerService cs;
    
    @RequestMapping()
    public String goToLogin(Model model){
        LoginFormBean loginBean = new LoginFormBean();
        model.addAttribute("loginBean", loginBean);
        return "login";
    }
    
    @RequestMapping(value = "/check")
    public String checkLogin (HttpSession session, @ModelAttribute("login") LoginFormBean loginBean,
            HttpServletResponse response, Model model){
        Tablecustomers customers = cs.findByUsername(loginBean.getUsername());
        if(customers.getUsername()== null){
            model.addAttribute("error", "Username atau Password Anda Salah");
            return "login";
        }
        session.setAttribute("user", customers);
        Cookie c = new Cookie("user", customers.getNamalengkap());
        c.setMaxAge(60*60*24);
        response.addCookie(c);
        return "successlogin";
    }
    
    @RequestMapping(value ="/out")
    public String logOut(HttpSession session, Model model){
        session.invalidate();
        return "redirect:/welcome";
    }
}
