package com.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
//        Vector v = new Vector();
//
//        Vector v2 = new Vector(10);
//        System.out.println(v2.capacity());
//
//        Vector v3 = new Vector(10, 20);
//        v3.add(10);
//        for(int i=0; i<=11; i++){
//            v3.add(i);
//        }
//        System.out.println(v3);
//        System.out.println(v3.capacity());
//
//        LinkedList ll = new LinkedList();
//        ll.add(10);
//        ll.add(90);
//
//        Vector v4 = new Vector(ll);
//        System.out.println(v4);
        //Methods=================


        Vector v5 = new Vector(2);
        System.out.println("Capacity before: " + v5.capacity());

        for(int i=1; i<=5 ;i++){
            v5.add(i*10);
        }
        v5.add("Ram");
        System.out.println(v5);

        v5.set(v5.indexOf("Ram"), "Shayam");
        System.out.println(v5);

        v5.ensureCapacity(5);
        System.out.println("Capacity after: " + v5.capacity());

        System.out.println(v5.firstElement());

        Vector v6 = new Vector();
        v6.add(12);
        v6.add(1);
        v6.add(15);
        v6.add(6);
        System.out.println(v6);
        Collections.sort(v6);
        System.out.println(v6);
    }
}
