package com.brainworks.oops.encapsule;

public class SuperChildDemo extends SuperParentDemo{

    int num=50;

    SuperChildDemo(){
        super(10);
        System.out.println("inside no-arg cons of child");
    }

    void show(){
        System.out.println(num);
        System.out.println(super.num);  //Parent class instance varible
        super.parentClassMethod();
    }

    public static void main(String[] args) {
        SuperChildDemo scd = new SuperChildDemo();
        scd.show();
    }
}
