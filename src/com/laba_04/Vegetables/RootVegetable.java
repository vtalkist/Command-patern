package com.laba_04.Vegetables;

abstract public class RootVegetable extends Vegetable{
    public RootVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Root vegetables");
    }

    public RootVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Root vegetables");
    }
}
