/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restaurant;

import com.mycompany.lunch.Lunch;

/**
 *
 * @author 123
 */
public abstract class Restaurant {

    public Lunch orderLunch(String type) {
        Lunch lunch;
        lunch = createLunch(type);
        String str = lunch.toString();
        System.out.println(str);
        lunch.prepare();
        lunch.cook();
        lunch.unfold();
        lunch.put();
        return lunch;
    }

    protected abstract Lunch createLunch(String type);
}
