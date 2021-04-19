package com.tts;

public class Car {
    private String color;
    private String type;
    private int numDoors;

    public Car(){

    }
    public Car(String color, String type, int numDoors){
        this.color = color;
        this.type = type;
        this.numDoors = numDoors;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean fun() {
        if (type.equals("honda")) {
            return true;
        } else{
            return false;
        }
    }
    @Override
        public String toString(){

            return  " I want a " + color + type + "with " + numDoors + " doors.";
        }

}
