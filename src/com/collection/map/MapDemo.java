package com.collection.map;

import com.collection.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Chetan", 150);
        Employee e2 = new Employee(8, "Paean", 250);
        Employee e3 = new Employee(15, "Aman", 10);
        Map map = new HashMap();
        map.put(10, e1);
        map.put(8, e2);
        map.put(15, e3);
        map.put(8, e3);
        map.put(null, e3);
        System.out.println(map);

    }
}
