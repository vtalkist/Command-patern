package com.laba_04.menu.item.SaladMenuItems;

import com.laba_04.Salad.Salad;
import com.laba_04.menu.item.Command;

public class sortIngredientsByWeight implements Command {
    public static String COMMAND = "sortByWeight";
    private Salad salad;

    public sortIngredientsByWeight(Salad salad){
        this.salad = salad;
    }
    @Override
    public void execute() {
        salad.sortIngredientsByWeight();
    }
}