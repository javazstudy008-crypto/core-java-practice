package com.brainworks.oops.encapsule;

public class NestedStaticClass {

    static class InnerClass{
        void show(){
            System.out.println("Inside inner class");
        }
    }

    public static void main(String[] args) {
        NestedStaticClass.InnerClass innerClass = new NestedStaticClass.InnerClass();
        innerClass.show();
    }
}
