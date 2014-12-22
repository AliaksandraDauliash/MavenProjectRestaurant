/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author 123
 */
public class TraditionalLunch1 extends Lunch {
    public TraditionalLunch1() {
        name = "Traditional lunch1";
        salad = "Salad 'Caesar'";
        first = "Cold beet soup with croutons";
        second = "Baked potatoes with mushrooms and cheese";
        drinks = "Green tea";
    }
    public void unfold() {
        System.out.println("Putting food on dishes");
    }

}
