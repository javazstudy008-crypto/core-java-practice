package com.brainworks.oops.encapsule;

public class StaticDemo {

    int i = 10;
    String collegeName = "abc";

    {                                               //Instance Initializer Block use to initalize instance varibale
//        StaticDemo sd = new StaticDemo();
//        sd.hello();
        System.out.println(collegeName);
    }

    static{
//        StaticDemo sd = new StaticDemo();
//        sd.hello();
        System.out.println("This is static block");
    }

    {                                               //Instance Initializer Block use to initalize instance varibale
        System.out.println("collegeName");
    }

    public void hello(){
        System.out.println("I'm here to just print hello");
    }

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        System.out.println("this is main method");
    }

    static{
        System.out.println("This is static block after");
    }
}
