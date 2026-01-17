package com.brainworks.oops.polymorph;

import com.brainworks.oops.Animal;

public class Parent {

    protected Object show(int a){
        System.out.println("This is Parent class method");
        Integer i;
//        System.out.println(a);
        return 10;
    }

//    public static Object charging(){
//        System.out.println("This is parent class charging method");
//        return " ";
//    }

    public static void main(String[] args) {
        Parent p = new Parent();
        Object i = p.show(10);
        System.out.println(i.getClass());
    }
    public void read(){
        System.out.println("Parent class is reading");
    }
}
