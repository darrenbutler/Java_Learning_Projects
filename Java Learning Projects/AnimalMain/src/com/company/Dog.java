package com.company;

public class Dog extends Animal {
    private int numberOfEyes;
    private int numberOfLegs;
    private int numberOfTeeth;
    private String coatColor;
    private String breed;
    // eyes, legs, teeth, coat, type//


    public Dog(String name, int brain, int body, int size, int weight, int numberOfEyes, int numberOfLegs, int numberOfTeeth, String coatColor, String breed) {
        super(name, brain, body, size, weight);//Inherited variables must be put in parameters and super
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
        this.numberOfTeeth = numberOfTeeth;
        this.coatColor = coatColor;
        this.breed = breed;
    }
}
