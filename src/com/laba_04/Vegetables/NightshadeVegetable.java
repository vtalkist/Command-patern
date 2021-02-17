package com.laba_04.Vegetables;

public class NightshadeVegetable extends Vegetable{

    public NightshadeVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Nightshade vegetables");
    }

    public NightshadeVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Nightshade vegetables");
    }
}