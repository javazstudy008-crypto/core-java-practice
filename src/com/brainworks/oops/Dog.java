package com.brainworks.oops;

public class Dog extends Animal{            //single level inheritance
    Dog(){
        this("Vishal", 30);
        System.out.println("inside Dog class no org constructor");
    }
    Dog(String abc, int b){
        super(20, "Archana");
        System.out.println("Child class constructor...");
    }

    public static void main(String[] args) {
//        Dog d = new Dog();
//        Animal a = new Animal();
//        a.animalName="Sheur";
//        System.out.println(a.animalName);
//        a.run();
//        d.run();
//        d.noOfLegs=3;
//        System.out.println(d.noOfLegs);


//        String s = new String();
//        String s1 = new String("parameter");
//        Object obj = new Object();
//
//        System.out.println(s instanceof Object);
//        Dog d = new Dog();
    }
}
