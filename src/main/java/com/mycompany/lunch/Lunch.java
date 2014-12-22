/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lunch;

/**
 *
 * @author 123
 */
public abstract class Lunch {

    protected String name;
    protected String salad;
    protected String first;
    protected String second;
    protected String drinks;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Preparing salad " + salad);
        System.out.println("Preparing first dish " + first);
        System.out.println("Preparing second dish " + second);
        System.out.println("Preparing drinks " + drinks);
    }

    public void cook() {
        System.out.println("Temperature treatment necessary dishes for 30-50 minutes");
    }

    public void unfold() {
        System.out.println("Putting food on dishes");
    }

    public void put() {
        System.out.println("Serving dishes to customers");
    }

    public String toString() {
        String str = new String();
        str = "Name: " + name;
        return str;
    }
}
