package com.company;

public class Bird extends Animal {
    private boolean hasWings = true;
    private boolean hasBeak = true;
    private String featherColor;

    public Bird(String name, int brain, int body, int size, int weight, boolean hasWings, boolean hasBeak, String featherColor) {
        super(name, brain, body, size, weight);
        this.hasWings = hasWings;
        this.hasBeak = hasBeak;
        this.featherColor = featherColor;
    }
}
