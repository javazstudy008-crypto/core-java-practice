package com.collection.map.hashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        Map map = new WeakHashMap();
        map.put(new Employee(15, "Aamir", 120000), 10);
        map.put(new Employee(10, "Salman", 1200000), 10);


//        // 1. reference is null
//        Employee emp1 = new Employee(10, "Samir", 150000);
//        emp1 = null;
//
//        //2. GC
//        Thread t = new Thread(new Employee(15, "Aamir", 120000));
    }
}
