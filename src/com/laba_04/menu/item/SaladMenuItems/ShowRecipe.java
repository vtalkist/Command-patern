package com.laba_04.menu.item.SaladMenuItems;

import com.laba_04.Salad.Salad;
import com.laba_04.menu.item.Command;

public class ShowRecipe implements Command {

    public static String COMMAND = "showRecipe";
    private Salad salad;

    public ShowRecipe(Salad salad){
        this.salad = salad;
    }
    @Override
    public void execute() {
        salad.showRecipe();
    }
}
