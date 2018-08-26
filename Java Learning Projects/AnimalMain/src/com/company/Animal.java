package com.company;
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String returnName(){
        return this.name;
    }

    public void eat(){
        System.out.println(this.name + " is eating.");
    }
}
