package com.laba_04.Vegetables;

public class SpicyVegetable extends Vegetable{

    public SpicyVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Spicy vegetables");
    }

    public SpicyVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Spicy vegetables");
    }
}
