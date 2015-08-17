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
public class AutoCloseableTest {
    public static void main(String[] args) {
        try(AutoClosableResource r = new AutoClosableResource()) {
            r.work();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
