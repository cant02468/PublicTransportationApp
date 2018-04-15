package com.company;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static com.company.HOVLane.*;

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
        HOVLane lane = new HOVLane(sc.nextInt());
        System.out.println(lane.toString());

        //Changed the size() method to be iterative since it seems more intuitive than passing a variable through its own method for recursion.
        System.out.println("\nThere are " + lane.size() + " cars in the HOV lane.");
    }
}