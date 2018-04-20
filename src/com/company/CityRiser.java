package com.company;

import java.util.ArrayList;

public class CityRiser {
    private ArrayList<Riser> risers = new ArrayList<>();

    CityRiser(int i) {
        for (int j = 0; j < i; j++) {
            risers.add(new Riser());
        }
    }

    @Override
    public String toString() {
        String returnString = "In this city, ";
        for (Riser riser: risers) returnString += riser.toString() + ", ";
        return returnString;
    }
}
