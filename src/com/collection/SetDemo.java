package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(20);
        System.out.println(set.add("Kunal"));
        set.add('b');
        System.out.println(set.add("Kunal"));
        set.add("Kunal");
        set.add("Kunal");
        System.out.println(set);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        System.out.println(set);
    }
}
