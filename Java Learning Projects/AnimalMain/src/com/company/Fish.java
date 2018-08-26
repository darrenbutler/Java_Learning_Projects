package com.company;

public class Fish extends Animal {
    private String waterType;

    public Fish(String name, int brain, int body, int size, int weight, String waterType) {
        super(name, brain, body, size, weight);
        this.waterType = waterType;
    }


    public void swim(){
        System.out.println("");
        System.out.println("Fishes like to swim.");
        System.out.println( returnName() + " is swimming.");
    }
}
