/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java7;

/**
 *
 * @author Chandu
 */
public class StringSwitch {

    public static void main(String[] args) {
        String color = "black";

        switch (color) {
            case "white":
                System.out.println("You selected the color white");
                break;
            case "black":
                System.out.println("You selected the color black");
                break;
            case "green":
                System.out.println("You selected the color green");
                break;
            case "yellow":
                System.out.println("You selected the color yellow");
                break;
        }
        
        Singleton s = Singleton.INSTANCE;
        System.out.println(s.getName("World"));
    }
}
