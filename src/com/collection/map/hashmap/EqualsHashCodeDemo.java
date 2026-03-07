package com.collection.map.hashmap;

import com.collection.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EqualsHashCodeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Chetan", 150);
        Employee e2 = new Employee(8, "Pawan", 250);
        Employee e3 = new Employee(15, "Aman", 10);
        Employee e4 = new Employee(15, "Aman", 10);

        System.out.println(e3.equals(e4));
        List list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        System.out.println(list.size());

        TreeSet ts = new TreeSet();
        ts.add(15);
        ts.add(null);

    }
}
