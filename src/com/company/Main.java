package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    enum Colors {
        Red, Orange, Yellow, Green, Blue, Violet, Black, Silver, White;

        private static final List<Colors> CourseList = List.of(values());

        public static String randomColors() {
            return CourseList.get(rand.nextInt(CourseList.size())).name();
        }
    }

    public static void main(String[] args) {

        System.out.println("\n\nHello PublicTransportationApp!\n");

        System.out.print("\nHow many cars would you want in the HOV lane? ");
        HovLane lane = new HovLane(sc.nextInt());
        System.out.println(lane.toString());

        System.out.println("\nThere are " + lane.size() + " cars in the HOV lane.");

        ArrayList<Integer> oneOccupantIDs = lane.carsWithSpecificOccupants(1);
        System.out.println("\nThe IDs of the cars with one occupant are " + oneOccupantIDs);

        System.out.print("\nWhat color are the cars you are searching for in the HovLane? ");
        String carColor = Colors.valueOf(sc.next()).toString();
        ArrayList<Integer> colorCarIDs = lane.carsWithSpecificColor(carColor);
        System.out.println("There are " + colorCarIDs.size() + " " + carColor + " cars.");

        CityRiser newOrleans = new CityRiser(3);
        System.out.println(newOrleans);

    }
}