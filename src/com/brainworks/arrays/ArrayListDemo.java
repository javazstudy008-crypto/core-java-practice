package com.brainworks.arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(5);
        al.add(15);
        al.add(10);
        al.add(12);
        al.add(11);
        al.add(18);
        al.add(15);
        al.add(15);

        System.out.println(al.get(3));
    }
}
