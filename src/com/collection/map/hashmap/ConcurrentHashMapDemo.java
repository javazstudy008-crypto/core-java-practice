package com.collection.map.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        Map map = new ConcurrentHashMap();
        map.put(10, "Red");
        map.put(20, "Blue");
        map.put(50, "Orange");
        map.put(80, "Black");
        map.put(40, "White");

        System.out.println(map);

        Map hashMap = new HashMap();

        Map synchronizedMap = Collections.synchronizedMap(hashMap);
    }
}
