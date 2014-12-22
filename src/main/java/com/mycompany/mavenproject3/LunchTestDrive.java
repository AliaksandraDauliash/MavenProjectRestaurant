/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject3;

import restaurants.*;
import lunches.Lunch;

/**
 *
 * @author 123
 */
public class LunchTestDrive {
  public static void main(String[] args) {
        int it;
        it= (int) (0 + Math.random() * 10);
        int tr;
        tr= (int) (0 + Math.random() * 10);
        System.out.println("Italian orders: "+it);
        System.out.println("Traditional orders: "+tr);
        Restaurant itRest= ItalianRestaurant.getInstance();
        Restaurant trRest = TraditionalRestaurant.getInstance();
        for(int i=0;i<it;i++){
            int itl;
        itl= (int) (0 + Math.random() * 2); 
        if(itl==0){
        Lunch lunch = itRest.orderLunch("Lunch");
        System.out.println(lunch.getName()+" ready.");
        }
        else
        { Lunch lunch = itRest.orderLunch("Lunch1");
        System.out.println(lunch.getName()+" ready.");
        }
        }
        for(int i=0;i<tr;i++){
            int itl;
        itl= (int) (0 + Math.random() * 2); 
        if(itl==0){
        Lunch lunch = trRest.orderLunch("Lunch");
        System.out.println(lunch.getName()+" ready.");
        }
        else
        { Lunch lunch = trRest.orderLunch("Lunch1");
        System.out.println(lunch.getName()+" ready.");
        }
        }
}
}
  