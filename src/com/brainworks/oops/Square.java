package com.brainworks.oops;

public class Square {

    Vehicle v = new Vehicle();

    Vehicle v2 = new Vehicle("abc", 10,  v);

    public void draw(){
        System.out.println("Draw square...");
    }
}
