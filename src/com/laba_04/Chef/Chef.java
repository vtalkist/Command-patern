package com.laba_04.Chef;


import com.laba_04.Salad.Salad;
import com.laba_04.Vegetables.Vegetable;

import java.lang.reflect.Constructor;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class realizes the main logic of the program, provides methods to
 * create salad, manage its ingredients, sort ingredients.
 */
public class Chef {
    private String name; // chef's name
    private Salad salad; // salad that he cooks

    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    /**
     * Default constructor. Chef's name is Bob, he cooks unknown salad.
     */

    public Chef() {
        name = "Bob";
        salad = new Salad();
    }

    /**
     * Constructor with parameter. Find another chef - named 'name'.
     * @param name the name of the chef
     */
    public Chef(String name) {
        this.name = name;
        salad = new Salad();
    }

    /**
     * Constructor with parameters 'name' - chef's name, 'salad' - salad to
     * work with.
     * @param name chef's name
     * @param salad the salad to work with
     */
    public Chef(String name, Salad salad) {
        this.name = name;
        this.salad = salad;
    }

    /**
     * Creates ingredient by parameters entered by user from the console.
     * @param scanner where to read the input parameters
     * @return returns a reference to a newly created Vegetable or null if
     * it was not created
     */
    public Vegetable getIngredient(Scanner scanner) {
        String ingredientName;
        double weight;

        System.out.println("Enter the ingredient name:");
        ingredientName = scanner.next();
        System.out.println("Enter the weight (in gramms):");

        try {
            weight = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong weight!");
            scanner.next();

            return null;
        }

        // create new vegetable using reflection
        try {
            Class [] parameters = {double.class};
            ingredientName = "com.laba_04.Vegetables." + ingredientName;
            Class ingredientClass = Class.forName(ingredientName);
            Constructor constructor =
                    ingredientClass.getDeclaredConstructor(parameters);
            Vegetable vegetable = (Vegetable) constructor.newInstance(
                    new Object[]{new Double(weight)});

            return vegetable;
        }
        catch (Exception e) {
            System.out.println("No such ingredient!");

            return null;
        }
    }

    /**
     * Displays the ingredients for a given range of calories.
     * @param scanner the input source
     */
    public void showIngredientsForCalories(Scanner scanner) {
        double lowerCalories, upperCalories;

        System.out.println("Enter the lower limit:");
        try {
            lowerCalories = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();

            return;
        }

        System.out.println("Enter the upper limit:");
        try {
            upperCalories = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();

            return;
        }

        salad.showIngredientsByCalories(lowerCalories, upperCalories);
    }
}