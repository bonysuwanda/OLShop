/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.bean;

import com.bony.entity.Tableproduct;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class CartBean {

    private Map<Integer, Tableproduct> carts;

    public CartBean(Map<Integer, Tableproduct> carts) {
        this.carts = carts;
    }

    public CartBean() {
        carts = new HashMap<>();
    }

    /**
     * @return the carts
     */
    public Map<Integer, Tableproduct> getCarts() {
        return carts;
    }

    /**
     * @param carts the carts to set
     */
    public void setCarts(Map<Integer, Tableproduct> carts) {
        this.carts = carts;
    }
    
    
    
}
