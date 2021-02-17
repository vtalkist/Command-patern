package com.laba_04.Salad;

import com.laba_04.Chef.CaloriesComparator;
import com.laba_04.Chef.WeightComparator;
import com.laba_04.Vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class Salad consists of a set of ingredients (vegetables). It provides
 * methods to add ingredients, sort them, show on the screen.
 */
public class Salad {
    private String name; // the name of the salad
    private List<Vegetable> ingredients = new ArrayList<Vegetable>();

    /**
     * Default constructor.
     */
    public Salad() {
        name = "Unknown";
    }

    /**
     * Constructor with parameters. Creates a salad with a given name.
     * @param name the name of the salad
     */
    public Salad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<?> getIngredients() {
        return ingredients;
    }

    public void setname(Scanner scanner) {
        System.out.println("Enter salad name: ");
        this.name = scanner.next();
    }

    public boolean addIngredient(Vegetable vegetable) {
        return ingredients.add(vegetable);
    }

    public void showRecipe() {
        if (ingredients.isEmpty()) {
            System.out.println("You haven't added any ingredients yet!");

            return;
        }

        System.out.println("The salad " + name + " contains:");
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.toString());
        }
        System.out.println("----------------------------");
        System.out.println("Total energy: " + countCalories() + "kcal");
    }

    public double countCalories() {
        double calories = 0.0;

        for (Vegetable vegetable : ingredients) {
            calories += vegetable.getTotalCalories();
        }

        return calories;
    }

    public void sortIngredientsByCalories() {
        Collections.sort(ingredients, new CaloriesComparator());
    }

    public void sortIngredientsByWeight() {
        Collections.sort(ingredients, new WeightComparator());
    }

    public void showIngredientsByCalories(double lowerCalories,
                                          double upperCalories) {
        double calories;

        System.out.println("Ingredients for calories ["
                + lowerCalories + ", " + upperCalories + "]");
        for (Vegetable vegetable : ingredients) {
            calories = vegetable.getCalories();
            if (calories >= lowerCalories && calories <= upperCalories) {
                System.out.println(vegetable.getName() + ", "
                        + vegetable.getCalories() + "kcal per 100g");
            }
        }
    }
}
