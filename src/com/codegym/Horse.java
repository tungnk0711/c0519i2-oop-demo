package com.codegym;

public class Horse extends Animal{

    private String color;

    public Horse() {
    }

    public Horse(int height, int weight, String color) {
        super(height, weight);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Toi co the an co");
    }

    @Override
    public void run() {
        System.out.println("Toi co the chay bon chan");
    }
}
