/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restaurant;

import com.mycompany.lunch.KindOfLunch;
import com.mycompany.lunch.Lunch;
import com.mycompany.lunch.UsualItalianLunch;
import com.mycompany.lunch.VegeterianItalianLunch;

/**
 *
 * @author 123
 */
public class ItalianRestaurant extends Restaurant {

    private static ItalianRestaurant instance;

    private ItalianRestaurant() {
    }

    @Override
    protected Lunch createLunch(String type) {
        if (type.equals(KindOfLunch.VEGKIND)) {
            return new VegeterianItalianLunch();
        } else if (type.equals(KindOfLunch.USKIND)) {
            return new UsualItalianLunch();
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
