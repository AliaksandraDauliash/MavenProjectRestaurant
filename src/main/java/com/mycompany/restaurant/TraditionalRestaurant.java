/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restaurant;

import com.mycompany.lunch.KindOfLunch;
import com.mycompany.lunch.Lunch;
import com.mycompany.lunch.UsualTraditionalLunch;
import com.mycompany.lunch.VegeterianTraditionalLunch;

/**
 *
 * @author 123
 */
public class TraditionalRestaurant extends Restaurant {

    private static TraditionalRestaurant instance;

    private TraditionalRestaurant() {
    }

    @Override
    protected Lunch createLunch(String type) {
        if (type.equals(KindOfLunch.VEGKIND)) {
            return new VegeterianTraditionalLunch(); 
        } else if (type.equals(KindOfLunch.USKIND)) {
            return new UsualTraditionalLunch();
        } else {
            return null;
        }
    }

    public static TraditionalRestaurant getInstance() {
        if (instance == null) {
            instance = new TraditionalRestaurant();
        }
        return instance;
    }
}
