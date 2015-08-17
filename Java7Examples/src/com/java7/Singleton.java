/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java7;

/**
 *
 * @author Chandu
 */
public enum Singleton {
    INSTANCE;
    
    public String getName(String s) {
        return "Hello " + s;
    }
}
