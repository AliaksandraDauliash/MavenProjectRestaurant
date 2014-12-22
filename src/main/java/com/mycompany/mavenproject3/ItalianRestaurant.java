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
public class ItalianRestaurant extends Restaurant {

    private static ItalianRestaurant instance;

    private ItalianRestaurant() {
    }

    protected Lunch createLunch(String type) {
        if (type.equals("Lunch")) {
            return new ItalianLunch();
        } else if (type.equals("Lunch1")) {
            return new ItalianLunch1();
        } else {
            return null;
        }
    }

    public static ItalianRestaurant getInstance() {
        if (instance == null) {
            instance = new ItalianRestaurant();
        }
        return instance;
    }
}
