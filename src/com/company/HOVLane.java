package com.company;

import java.util.ArrayList;

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

    public ArrayList<Integer> carsWithSpecificOccupants(int numOccupants) {
        ArrayList<Integer> carIDs = new ArrayList<>();
        if (this.car.getOccupants() == numOccupants) carIDs.add(this.car.getId());
        HOVLane temp = this.next;
        while (temp != null){
            if (temp.car.getOccupants() == numOccupants) carIDs.add(temp.car.getId());
            temp = temp.next;
        }
        return carIDs;
    }

    public ArrayList<Integer> carsWithSpecificColor(String carColor) {
        ArrayList<Integer> carIDs = new ArrayList<>();
        if (this.car.getColor().equals(carColor)) carIDs.add(this.car.getId());
        HOVLane temp = this.next;
        while (temp != null){
            if (temp.car.getColor().equals(carColor)) carIDs.add(temp.car.getId());
            temp = temp.next;
        }
        return carIDs;
    }
}
