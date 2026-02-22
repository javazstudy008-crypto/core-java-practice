package com.collection;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
//        Set hs1 = new HashSet();
//        hs1.add(15);
//        hs1.add(55);
//        Set hs2 = new HashSet();
//        hs2.add(15);
//        hs2.add(85);
//        hs2.add(15);
//        hs2.add(22);
//        hs2.add(11);
//
//        System.out.println(hs1.equals(hs2));

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(15);
        lhs.add(22);
        lhs.add(85);
        System.out.println(lhs);

        TreeSet ts = new TreeSet(lhs);
        ts.add(15);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(60);
        ts.add(15);

        System.out.println(ts);
//
//        TreeSet tss = new TreeSet();
//        tss.add("Karan");
//        tss.add("Piyash");
//        tss.add("Arjun");
//        tss.add("Chetan");
//        tss.add("Piyush");
//
//        System.out.println(tss);
//
//        ArrayList al = new ArrayList();
//        al.add(15);
//        al.add(10);
//        al.add(20);
//        al.add(25);
//        al.add(1);
//        al.add(9);
//
//        System.out.println("al: "+ al);
//        TreeSet tsss = new TreeSet(al);
//        System.out.println("tsss: " + tsss);

    }
}
