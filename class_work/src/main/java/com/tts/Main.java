package com.tts;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Dot Method---");

        ArrayList<String> theList = new ArrayList<>();

        theList.add("first");
        theList.add("Second");

        int size = theList.size();

        System.out.println(size);

        String val = theList.get(1);

        System.out.println(val);

        System.out.println("--Car--");

//        Car car= new Car();
//        car.color = "blue";
//        car.numberOfDoor = 4;
//
//
//        car.start();
//        car.stop();
//        car.drive();
//
//        System.out.println(car.color);
//        System.out.println(car.numberOfDoor);
    }
}
