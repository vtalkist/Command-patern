package com.laba_04.Vegetables;

public class Tomato extends NightshadeVegetable {

    /**
     * Default constructor.
     */
    public Tomato() {
        super("Tomato", 18);
    }

    /**
     * Constructor with parameters. Creates a Tomato of a given weight.
     * @param weight the mass of the vegetable that will be created
     */
    public Tomato(double weight) {
        super("Tomato", 18, weight);
    }
}
