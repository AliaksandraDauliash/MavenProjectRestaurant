/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurants;

import lunches.*;

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
        if (type.equals("Lunch")) {
            return new TraditionalLunch();
        } else if (type.equals("Lunch1")) {
            return new TraditionalLunch1();
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
