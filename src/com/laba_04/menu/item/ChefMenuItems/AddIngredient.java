package com.laba_04.menu.item.ChefMenuItems;

import com.laba_04.Chef.Chef;
import com.laba_04.Salad.Salad;
import com.laba_04.Vegetables.Vegetable;
import com.laba_04.menu.item.Command;

import java.util.Scanner;

public class AddIngredient implements Command {
    private Salad salad;
    private Chef chef;
    private Vegetable vegetable;

    private Scanner scanner;

    public static String COMMAND = "AddIngredient";

    public AddIngredient(Chef chef, Salad salad, Scanner scanner) {
        this.chef = chef;
        this.salad = salad;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        vegetable = chef.getIngredient(scanner);
        if (vegetable != null)
            if (!salad.addIngredient(vegetable))
                System.out.println("Cannot add ingredient!");
    }
}
