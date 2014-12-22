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
public class VegeterianItalianLunch extends Lunch {

    public VegeterianItalianLunch() {
        name = "Vegeterian italian lunch";
        salad = "Italian salad with ham, cheese and vegetables";
        first = "Italian soup with white beans";
        second = "Meat lasagna with zucchini";
        drinks = "Coffee and chocolate drink in Italian";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof VegeterianItalianLunch) {
            VegeterianItalianLunch temp = (VegeterianItalianLunch) obj;
            return this.name.equals(temp.name)
                    && this.salad.equals(temp.salad)
                    && this.first.equals(temp.first)
                    && this.second.equals(temp.second)
                    && this.drinks.equals(temp.drinks);
        } else {
            return false;
        }
    }

    public String toString() {
        String str = new String();
        str = super.toString() + "; Salad: " + salad + "; First: " + first + "; Second: " + second + "; Drinks: " + drinks + ";";
        return str;
    }
}
