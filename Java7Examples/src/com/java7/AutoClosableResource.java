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
public class AutoClosableResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("in Close()");
        throw new RuntimeException("Exception in close()"); 
    }

    public void work() throws Exception {
        System.out.print("In work()");
        throw new Exception("Exception in work()");
    }
}
