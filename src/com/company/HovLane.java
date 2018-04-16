package com.company;

import java.util.ArrayList;

public class HovLane {
    private Car head;
    private HovLane next = null;

    HovLane(int numCars) {
        this.head = new Car();
        if (numCars > 1) this.next = new HovLane(numCars-1);
    }

    @Override
    public String toString() {
        if (next == null) { return "" + this.head; }
        return this.head + " followed by " + next.toString();
    }

    public int size() {
        HovLane temp = this.next;
        int count = 1;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ArrayList<Integer> carsWithSpecificOccupants(int numOccupants) {
        ArrayList<Integer> carIDs = new ArrayList<>();
        if (this.head.getOccupants() == numOccupants) { carIDs.add(this.head.getId()); }
        HovLane temp = this.next;
        while (temp != null){
            if (temp.head.getOccupants() == numOccupants) carIDs.add(temp.head.getId());
            temp = temp.next;
        }
        return carIDs;
    }

    public ArrayList<Integer> carsWithSpecificColor(String carColor) {
        ArrayList<Integer> carIDs = new ArrayList<>();
        if (this.head.getColor().equals(carColor)) { carIDs.add(this.head.getId()); }
        HovLane temp = this.next;
        while (temp != null){
            if (temp.head.getColor().equals(carColor)) carIDs.add(temp.head.getId());
            temp = temp.next;
        }
        return carIDs;
    }
}
