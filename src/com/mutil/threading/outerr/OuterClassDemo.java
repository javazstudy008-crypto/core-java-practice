package com.mutil.threading.outerr;

public class OuterClassDemo {
    static int j=20;
    static class StaticNestedClassDemo{
        int i=10;
    }

    class InnerClassDemo{                   //InnerClass
        String s = "Java";
    }

    public static void main(String[] args) {
        OuterClassDemo.StaticNestedClassDemo staticDemo = new OuterClassDemo.StaticNestedClassDemo();       //Object creation for static nested class
        System.out.println(staticDemo.i);
        OuterClassDemo obj = new OuterClassDemo();
        OuterClassDemo.InnerClassDemo innerObj = obj.new InnerClassDemo();
        System.out.println(innerObj.s);
    }
}
