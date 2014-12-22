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
public abstract class Restaurant {
    public Lunch orderLunch (String type) {
        Lunch lunch;
        lunch = createLunch(type);
        lunch.prepare();
        lunch.cook();
        lunch.unfold();
        lunch.put();
        return lunch;
    }
    protected abstract Lunch createLunch (String type);
}
