package com.laba_04.menu.item.ChefMenuItems;

import com.laba_04.Chef.Chef;
import com.laba_04.Salad.Salad;
import com.laba_04.menu.item.Command;

import java.util.Scanner;

public class VegetablesInCaloriesRange implements Command {

    private Chef chef;
    private Salad salad;
    private Scanner scanner;
    public static String COMMAND = "InCaloriesRange";

    public VegetablesInCaloriesRange() {}

    public VegetablesInCaloriesRange(Chef chef, Salad salad, Scanner scanner) {
        this.chef = chef;
        this.scanner = scanner;
        chef.setSalad(salad);
    }

    @Override
    public void execute() {
        chef.showIngredientsForCalories(scanner);
    }
}
