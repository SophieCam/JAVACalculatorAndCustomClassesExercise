package com.tts;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> theList = new ArrayList<>(); //object theList is a new instance of arraylist (a class)
                                                        // which is currently empty

        theList.add("First");  //adds an elements to the list
        theList.add("Second"); //adds another element to the list

        int size = theList.size();

        System.out.println(size);


        String val = theList.get(1);
        System.out.println(val); //output is second

        System.out.println("====car=====");

        Car car = new Car ();  //instantiating and using a car object (instance of a class called "Car")
        car.color= "blue";
        car.numberOfDoors= 4;

        car.start(); //car starting
        car.stop(); //car stopping
        car.drive(); // car driving

        System.out.println(car.color);
        System.out.println(car.numberOfDoors);

        System.out.println("=====Pet Lab=======");
        Pet pet = new Pet();
        pet.myPet();
        System.out.println();

        System.out.println("=======Custom Class====");
        House houseListing = new House();

        houseListing.toString();
        System.out.println(houseListing.toString());

        System.out.println(houseListing.checkYear(1989));
        System.out.println(houseListing.isHouseNew(1989));

        System.out.println("=======Calculator====");
        MagicCalculator myCalculator=new MagicCalculator();
        System.out.println(myCalculator.factorial(5));

        System.out.println(Calculator.multiply(5, 5));
    }
}
