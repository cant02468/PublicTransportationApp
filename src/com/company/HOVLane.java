package com.company;

public class HOVLane {
    Car car;
    HOVLane next;

    public HOVLane(int numCars) {
        this.car = new Car();
        if (numCars > 1) this.next = new HOVLane(numCars-1);
    }

    @Override
    public String toString() {
        if (next == null) return "" + this.car;
        return this.car + " followed by " + next.toString();
    }
}
