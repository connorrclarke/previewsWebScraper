/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

import java.io.Serializable;
import java.util.TreeMap;

/**
 *
 * @author Clarke_876632
 */
public class WishlistModel implements Serializable{
    
    private TreeMap<String, Product> products;

    public WishlistModel(TreeMap<String, Product> products) {
        this.products = products;
    }
    
    public TreeMap<String, Product> getProducts() {
        return products;
    }
}
