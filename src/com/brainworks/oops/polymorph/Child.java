package com.brainworks.oops.polymorph;

import com.brainworks.oops.Sheru;

public class Child extends Parent{
    @Override
    public String show(int num){
        System.out.println("This is child class method");
        return "Shlok";
    }

//    public static Object charging(){
//        System.out.println("This is parent class charging method");
//        return " ";
//    }

    public void run(){
        System.out.println("Child is running");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.read();
        child.run();
        child.show(10);           //child class method called
        Parent parent = new Parent();
        parent.read();          //Parent class
//        parent.show(20);          //Parent method called
//        parent.run();
    }
}
