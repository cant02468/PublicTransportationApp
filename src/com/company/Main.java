package com.company;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static com.company.HOVLane.*;

public class Main {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public enum Colors {
        Red, Orange, Yellow, Green, Blue, Violet, Black, Silver, White;

        private static final List<Colors> CourseList = List.of(values());

        public static String randomColors() {
            return CourseList.get(rand.nextInt(CourseList.size())).name();
        }
    }

    public static void main(String[] args) {

        System.out.println("\n\nHello PublicTransportationApp!\n");

        System.out.print("\nHow many cars would you want in the HOV lane?");
        HOVLane lane = new HOVLane(sc.nextInt());
        System.out.println(lane.toString());

        //I figured this was the best way to find size recursively.
        System.out.println("\nThere are " + size(lane) + " cars in the HOV lane.");
    }
}