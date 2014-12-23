/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lunch;

import java.util.Objects;

/**
 *
 * @author 123
 */
public abstract class Lunch {

    protected String name;
    protected String salad;
    protected String first;
    protected String second;
    protected String drinks;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Preparing salad " + salad);
        System.out.println("Preparing first dish " + first);
        System.out.println("Preparing second dish " + second);
        System.out.println("Preparing drinks " + drinks);
    }

    public void cook() {
        System.out.println("Temperature treatment necessary dishes for 30-50 minutes");
    }

    public void unfold() {
        System.out.println("Putting food on dishes");
    }

    public void put() {
        System.out.println("Serving dishes to customers");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lunch other = (Lunch) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.salad, other.salad)) {
            return false;
        }
        if (!Objects.equals(this.first, other.first)) {
            return false;
        }
        if (!Objects.equals(this.second, other.second)) {
            return false;
        }
        if (!Objects.equals(this.drinks, other.drinks)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.salad);
        hash = 67 * hash + Objects.hashCode(this.first);
        hash = 67 * hash + Objects.hashCode(this.second);
        hash = 67 * hash + Objects.hashCode(this.drinks);
        return hash;
    }

    @Override
    public String toString() {
        String str = "Name: " + name + "; Salad: " + salad + "; First: " + first + "; Second: " + second + "; Drinks: " + drinks + ";";
        return str;
    }
}
