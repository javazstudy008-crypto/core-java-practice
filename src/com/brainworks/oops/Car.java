package com.brainworks.oops;

public class Car extends Vehicle{

    Car(){                  //car IS-A vehicle; truck IS-A vehicle
//        super();
//        this(10, "abc");
//        super("Rahul", 12);             //super and this should be the first statement in a cosntructor body
        System.out.println("INside child class no-org constructor");
    }

    Car(int c, String abc){
        System.out.println("INside child class Parameterized constructor");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.startVehicle();
    }
}
