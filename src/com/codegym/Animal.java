package com.codegym;

public class Animal {
    private int height;
    private int weight;

    public Animal() {
    }

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Toi co the an");
    }

    public void run() {
        System.out.println("Toi co the chay");
    }

    @Override
    public String toString() {
        return "Height: " + this.height + " Weight: " + this.weight;
    }
}
