package com.company;

public class truck {
    String model;
    String color;
    String Engine;
    int topSpeed;

    public truck(String model, String color, String engine, int topSpeed) {
        this.model = model;
        this.color = color;
        Engine = engine;
        this.topSpeed = topSpeed;
    }

    public void aboutTruck(){
        System.out.println(this.color);
        System.out.println(this.model);
        System.out.println(this.Engine);
        System.out.println(this.topSpeed);
    }
}
