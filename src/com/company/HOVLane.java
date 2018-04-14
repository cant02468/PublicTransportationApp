package com.company;

public class HOVLane {
    private Car car;
    private HOVLane next = null;

    public HOVLane(int numCars) {
        this.car = new Car();
        if (numCars > 1) this.next = new HOVLane(numCars-1);
    }

    @Override
    public String toString() {
        if (next == null) return "" + this.car;
        return this.car + " followed by " + next.toString();
    }

    public static int size(HOVLane lane) {
        if (lane == null) return 0;
        return 1 + size(lane.next);
    }
}
