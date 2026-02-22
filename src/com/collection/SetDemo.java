package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
//        set.add(20);            //unique integer value of obj is called hashcode
//        set.add(10);
//        set.add(20);
//        set.add(40);
        set.add(50);
        System.out.println(set);
        Set set2 = new HashSet();
//        set2.add(0);
//        set2.add(5);
        set2.add(70);
        set2.add(50);

        System.out.println(set.retainAll(set2));
        System.out.println("set: " + set);
        System.out.println("set2: " + set2);
        System.out.println("hashcode: " + set.hashCode());


        Set setA = new HashSet();
        setA.add(10);
        setA.add(20);
        setA.add(50);
        Set setB = new HashSet();
        setB.add(20);
        setB.add(70);
        System.out.println(setA.retainAll(setB));
        System.out.println(setA);           //[20]
        System.out.println(setB);           //[20, 70]
        System.out.println(setA.retainAll(setB));
        System.out.println(setA);           //[20]
        System.out.println(setB);

    }
}
