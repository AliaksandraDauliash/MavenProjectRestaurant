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
public class VegeterianTraditionalLunch extends Lunch {

    public VegeterianTraditionalLunch() {
        name = "Vegeterian traditional lunch";
        salad = "Salad 'Caesar'";
        first = "Cold beet soup with croutons";
        second = "Baked potatoes with mushrooms and cheese";
        drinks = "Green tea";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof VegeterianTraditionalLunch) {
            VegeterianTraditionalLunch temp = (VegeterianTraditionalLunch) obj;
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
