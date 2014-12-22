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
public class UsualItalianLunch extends Lunch {

    public UsualItalianLunch() {
        name = "Usual italian lunch";
        salad = "Salad of red beans with curd cheese , red onion and seasonal salad";
        first = "Cream of green peas and pumpkin";
        second = "Pasta with tuna";
        drinks = "Italian hot chocolate";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UsualItalianLunch) {
            UsualItalianLunch temp = (UsualItalianLunch) obj;
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
