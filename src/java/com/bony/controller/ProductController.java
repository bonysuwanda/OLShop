/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.controller;

import com.bony.dao.ProductService;
import com.bony.entity.Tableproduct;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    ProductService ps;
    
    @RequestMapping(value="/all")
    public String seeOurProduct(Model model){
        List<Tableproduct> product = ps.findAll();
        model.addAttribute("product",product);
        return "product";
    }
    
    @RequestMapping(value="/{ID}")
    public String detailProduct (@PathVariable Integer ID ,Model model){
        Tableproduct product = ps.findById(ID);
        model.addAttribute("detproduct",ID);
        return "datailproduct";
    }
}
