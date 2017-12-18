/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.controller;

import com.bony.bean.RegisterFormBean;
import com.bony.dao.CustomerService;
import com.bony.entity.Tablecustomers;
import com.bony.utils.PasswordDigest;
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
@RequestMapping("/register")
public class RegisterController {
    
    @Autowired
    CustomerService cs;
    
    @RequestMapping()
    public String register(Model model){
        RegisterFormBean registerBean = new RegisterFormBean();
        model.addAttribute("registerBean", registerBean);
        return "register";
    }
    
    @RequestMapping(value="/save")
    public String saveRegister(@ModelAttribute("registerBean") RegisterFormBean registerBean, Model model ){
        Tablecustomers customer = new Tablecustomers();
        String encryptPassword = PasswordDigest.createEncryptedPassword(registerBean.getPassword());
        customer.setNamalengkap(registerBean.getNamaLengkap());
        customer.setEmail(registerBean.getEmail());
        customer.setPhone(registerBean.getNotelp());
        customer.setAddress(registerBean.getAddress());
        customer.setUsername(registerBean.getUsername());
        customer.setPassword(registerBean.getPassword());
        cs.saveCustomer(customer);
        model.addAttribute("data", registerBean);
        return "successregister";
    }
}
