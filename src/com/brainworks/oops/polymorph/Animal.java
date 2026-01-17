package com.brainworks.oops.polymorph;

public class Animal {
    public void run(){
        System.out.println("Animal runs");
    }

    public static void main(String[] args) {
        String s1 = new String("Chetan");
        String s2 = new String("Chetan");
        System.out.println(s1.equals(s2));          //true
        System.out.println(s1==s2);                 //false

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));          //check if address are same
        System.out.println(o1==o2);                 //check if address are same
    }
}
