package com.codegym;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Animal animal1 = new Bird(100, 150, "Blue");
        animal1.run();
        animal1.eat();
        ((Bird) animal1).fly();


        Animal animal2 = new Horse(150, 300, "White");
        animal2.run();
        animal2.eat();

        if(animal2 instanceof Bird){
            System.out.println("True");
        }else {
            System.out.println("False");
        }



        /*Animal animal = new Animal(100, 150);

        System.out.println(animal.toString());*/



        /*Rectangle rectangle1 = new Rectangle(4, 8);
        int area1 = rectangle1.getArea();
        int perimeter1 = rectangle1.getPerimeter();

        Rectangle rectangle2 = new Rectangle(3, 5);
        int area2 = rectangle2.getArea();
        int perimeter2 = rectangle2.getPerimeter();



        System.out.println("Area: "+area1);
        System.out.println("Perimeter: "+ perimeter1);

        System.out.println("Area: "+area2);
        System.out.println("Perimeter: "+ perimeter2);*/

        /*QuanLyNgheSy quanLyNgheSy = new QuanLyNgheSy();

        NgheSy ngheSy1 = new NgheSy("Tram Anh", 1);
        quanLyNgheSy.themNgheSy(ngheSy1);

        NgheSy ngheSy2 = new NgheSy("Ha", 2);
        quanLyNgheSy.themNgheSy(ngheSy2);

        NgheSy ngheSy3 = new NgheSy("Kien", 3);
        quanLyNgheSy.themNgheSy(ngheSy3);



        NgheSy[] dsNgheSy = quanLyNgheSy.traVe();
        for (NgheSy ngheSy : dsNgheSy) {
            if (ngheSy != null) {
                System.out.println("ID: " + ngheSy.getId() + " NAME: " + ngheSy.getName());
            }
        }*/

    }
}
