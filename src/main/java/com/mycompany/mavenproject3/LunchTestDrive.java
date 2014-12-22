/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import com.mycompany.lunch.KindOfLunch;
import com.mycompany.lunch.Lunch;
import com.mycompany.restaurant.ItalianRestaurant;
import com.mycompany.restaurant.Restaurant;
import com.mycompany.restaurant.TraditionalRestaurant;

/**
 *
 * @author 123
 */
public class LunchTestDrive {

    public static void main(String[] args) {
        int it = (int) (0 + Math.random() * 10);
        int tr = (int) (0 + Math.random() * 10);
        System.out.println("Italian orders: " + it);
        System.out.println("Traditional orders: " + tr);
        Restaurant itRest = ItalianRestaurant.getInstance();
        Restaurant trRest = TraditionalRestaurant.getInstance();
        for (int i = 0; i < it; i++) {
            int itl;
            itl = (int) (0 + Math.random() * 2);
            if (itl == 0) {
                KindOfLunch kind = new KindOfLunch();
                Lunch lunch = itRest.orderLunch(kind.vegkind);
                System.out.println(lunch.getName() + " ready.");
            } else {
                KindOfLunch kind = new KindOfLunch();
                Lunch lunch = itRest.orderLunch(kind.uskind);
                System.out.println(lunch.getName() + " ready.");
            }
        }
        for (int i = 0; i < tr; i++) {
            int itl;
            itl = (int) (0 + Math.random() * 2);
            if (itl == 0) {
                Lunch lunch = trRest.orderLunch("Vegeterian lunch");
                System.out.println(lunch.getName() + " ready.");
            } else {
                Lunch lunch = trRest.orderLunch("Usual lunch");
                System.out.println(lunch.getName() + " ready.");
            }
        }
    }
}
