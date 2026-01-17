package com.brainworks.oops;

public class Animal {

    public int noOfLegs;
    String animalName;

    public Animal()
    {               //no-arg(0-arg) constructor                package-private
        System.out.println("parent class constructor...");
    }
    Animal(int abc, String animalName){            //loaded constructor: constructor loading
        noOfLegs = abc;
        this.animalName = animalName;
        System.out.println("inside parameterized constructor");
    }

    public static Animal Singleton(){
        Animal a = new Animal(4, "Animal12");
        return a;
    }

//    Animal(String animalName, int abc){            //loaded constructor: constructor loading
//        this.noOfLegs = noOfLegs;
//        this.animalName = animalName;
//        System.out.println("inside 2========");
//    }

//    Animal(int noOfLegs){
//        this.noOfLegs = noOfLegs;
//    }
    public void voice(){
        System.out.println("Animal voice");
    }

    public void run(){
        System.out.println("I'm running");
    }

}
