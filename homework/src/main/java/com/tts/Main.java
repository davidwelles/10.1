package com.tts;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Car car = new Car();

        pet.setAge(5);
        pet.setLocation("charlotte");
        pet.setName("cooper");

        car.setColor("red");
        car.setNumDoors(4);
        car.setType("BMW");
        System.out.println(car.toString());


    }
}
