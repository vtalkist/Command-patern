package com.laba_04.Vegetables;

public class Carrot extends RootVegetable{

    /**
     * Default constructor.
     */
    public Carrot() {
        super("Carrot", 41);
    }

    /**
     * Constructor with parameters. Creates a Carrot of a given weight.
     * @param weight the mass of the vegetable that will be created
     */
    public Carrot(double weight) {
        super("Carrot", 41, weight);
    }
}