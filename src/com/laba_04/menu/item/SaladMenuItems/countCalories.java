package com.laba_04.menu.item.SaladMenuItems;

import com.laba_04.Salad.Salad;
import com.laba_04.menu.item.Command;

public class countCalories implements Command {
    public static String COMMAND = "countCalories";
    private Salad salad;
    private double calories;

    public countCalories(Salad salad){
        this.salad = salad;
    }
    @Override
    public void execute() {
        System.out.println("Salad calories sum:" + salad.countCalories());
    }
}
