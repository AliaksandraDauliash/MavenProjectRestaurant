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
public class TraditionalLunch extends Lunch {
    public TraditionalLunch() {
        name = "Traditional lunch";
        salad = "Fresh vegetable salad";
        first = "Cheese soup";
        second = "Pork in sweet and sour sauce";
        drinks = "Fresh orange juice";
    }

    public void unfold() {
        System.out.println("Putting food on dishes");
    }

}
