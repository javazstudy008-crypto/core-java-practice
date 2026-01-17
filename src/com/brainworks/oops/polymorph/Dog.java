package com.brainworks.oops.polymorph;

public class Dog extends Animal{
    @Override
    public void run(){              //method overriding
        System.out.println("Dog runs in evening");
    }

    public void voice(){
        System.out.println("Dog barks...");
    }

    public static void main(String[] args) {
        String s = new String();
        s.equals("abc");
        Dog d = new Dog();
        Animal a = new Animal();
        Animal A1=new Dog();


        d.run();
        a.run();
        d.voice();
//        a.voice();                //parent class can't access the properties of child class
    }
}
