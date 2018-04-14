package com.company;

public class Car {
    String color;

    public Car(){
        this.color = Main.Colors.randomColors();
    }

    @Override
    public String toString() {
        return color + " car";
    }
}
