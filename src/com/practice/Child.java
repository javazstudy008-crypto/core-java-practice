package com.practice;

public class Child extends Parent{
    Child(String s){            //parameterized
        super("xyz");
        System.out.println(s);
    }

    Child(){                    //no-arg
        this("abc");
    }
    public static void main(String[] args) {
        Child c = new Child();
//        Child c1 = new Child("pqr");
    }
}
