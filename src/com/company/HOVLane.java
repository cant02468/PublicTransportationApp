package com.company;

public class HOVLane {
    private Car car;
    private HOVLane next = null;

    HOVLane(int numCars) {
        this.car = new Car();
        if (numCars > 1) this.next = new HOVLane(numCars-1);
    }

    @Override
    public String toString() {
        if (next == null) return "" + this.car;
        return this.car + " followed by " + next.toString();
    }

    public int size() {
        HOVLane temp = this.next;
        int count = 1;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
