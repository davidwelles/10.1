package com.tts;

public class Car {

    private String color;
    private int numberOfDoor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public void start(){
        System.out.println("Car Starting");
    }

    public void stop(){
        System.out.println("Car stopping");
    }

    public void drive(){
        System.out.println("Car Driving");
    }
}
