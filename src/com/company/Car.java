package com.company;

public class Car {
    String color;
    //public static int numCars = 0;

    Car(){
        this.color = Main.Colors.randomColors();
        //numCars++;
    }

    @Override
    public String toString() {
        return color + " car"; //+ numCars;
    }
}
