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
public  class ItalianLunch1 extends Lunch {
    public ItalianLunch1() {
        name = "Italian lunch1";
        salad = "Salad of red beans with curd cheese , red onion and seasonal salad";
        first = "Cream of green peas and pumpkin";
        second = "Pasta with tuna";
        drinks = "Italian hot chocolate";
    }
     public void unfold() {
        System.out.println("Putting food on dishes");
    }
   }
