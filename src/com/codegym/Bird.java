package com.codegym;

public class Bird extends Animal {
    private String color;

    public Bird(int height, int weight, String color) {
        super(height, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Toi co the an ca");
    }

    @Override
    public void run() {
        System.out.println("Toi co the chay hai chan");
    }

    public void fly() {
        System.out.println("Toi co the bay");
    }


}
