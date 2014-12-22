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
public class UsualTraditionalLunch extends Lunch {

    public UsualTraditionalLunch() {
        name = "Usual traditional lunch";
        salad = "Fresh vegetable salad";
        first = "Cheese soup";
        second = "Pork in sweet and sour sauce";
        drinks = "Fresh orange juice";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UsualTraditionalLunch) {
            UsualTraditionalLunch temp = (UsualTraditionalLunch) obj;
            return this.name.equals(temp.name)
                    && this.salad.equals(temp.salad)
                    && this.first.equals(temp.first)
                    && this.second.equals(temp.second)
                    && this.drinks.equals(temp.drinks);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = new String();
        str = super.toString() + "; Salad: " + salad + "; First: " + first + "; Second: " + second + "; Drinks: " + drinks + ";";
        return str;
    }
}
