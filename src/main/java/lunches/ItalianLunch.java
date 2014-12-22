/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunches;

/**
 *
 * @author 123
 */
public class ItalianLunch extends Lunch {
    public ItalianLunch() {
        name = "Italian lunch";
        salad = "Italian salad with ham, cheese and vegetables";
        first = "Italian soup with white beans";
        second = "Meat lasagna with zucchini";
        drinks = "Coffee and chocolate drink in Italian";
     }

    @Override
    public void unfold() {
        System.out.println("Putting food on dishes");
    }

}
