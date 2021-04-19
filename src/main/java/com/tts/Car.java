package com.tts;

public class Car {

    public String color; //variable aka attributes are set
    public int numberOfDoors;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void start() //method aka actions
    {
        System.out.println("Car starting");
    }

    public void stop() {
        System.out.println("Car stopping");
    }

    public void drive(){
        System.out.println("Car driving");
    }

}

