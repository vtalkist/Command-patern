package com.laba_04.menu.item.SaladMenuItems;

import com.laba_04.Salad.Salad;
import com.laba_04.menu.item.Command;

public class sortIngredientsByCalories implements Command{
    public static String COMMAND = "sortByCalories";
    private Salad salad;

    public sortIngredientsByCalories(Salad salad){
        this.salad = salad;
    }
    @Override
    public void execute() {
        salad.sortIngredientsByCalories();
    }
}
