package com.company;

import java.util.Stack;

public class Riser {
    private Stack<Car> storage = new Stack<>();
    private int numCars;
    private int id;
    private static int riserId = 1;

    Riser(){
        this.id = riserId;
        riserId++;
    }

    private void push(Car car){
        numCars++;
        storage.push(car);
    }

    private Car pop(){
        numCars--;
        return storage.pop();
    }

    private int carsStored(){
        return numCars;
    }

    @Override
    public String toString() {
        return "Riser " + this.id + " is storing " + numCars +
                " cars";
    }
}
