package com.brainworks.oops.polymorph;

public abstract class AbtractClass {

    int a =10;
    public AbtractClass(){
        System.out.println("Abstract class constructor");
    }
    public abstract void show();
    public abstract void write();

    public static void read(){
        int i=10;
        System.out.println("abstract class is reading");
    }
}
