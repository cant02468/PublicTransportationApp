package com.company;

import java.util.Random;

public class Car {
    private String color;
    private int id;
    private static int carID = 0;
    private int occupants;

    Car(){
        Random rand = new Random();
        this.color = Main.Colors.randomColors();
        this.id = carID;
        carID++;
        //Assuming the cars can hold up to 5 occupants.
        this.occupants = rand.nextInt(5) + 1 ;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public int getOccupants() {
        return occupants;
    }

    @Override
    public String toString() {
        return color + " car|" + this.occupants + " occupants|ID:" + this.id;
    }
}
