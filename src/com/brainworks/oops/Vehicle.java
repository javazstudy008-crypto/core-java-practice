package com.brainworks.oops;

public class Vehicle {
    public int noOfTyres;
    public Engine engine;
    public String musicSystem;

    Vehicle(){
        System.out.println("Parent class no-org constructor...");
    }

    Vehicle(String name, int a, Vehicle v){
        this();
        System.out.println("inside parent class parameterized constructor");
    }

    public static void main(String[] args) {

    }
    public void startVehicle(){
        System.out.println("vehicle has started...");
    }
}
