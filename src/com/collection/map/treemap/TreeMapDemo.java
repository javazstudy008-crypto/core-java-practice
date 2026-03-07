package com.collection.map.treemap;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap();
        tm.put(101, "Chetan");
        tm.put(100, "Rahul");
        tm.put(105, "Ravi");
        tm.put(103, "Pranav");
        tm.put(108, "Praful");
        tm.put(104, "Samir");
//        tm.put(null, null);           //null not allowed: nullPointerException

        System.out.println(tm);
        System.out.println(tm.remove(105));
        System.out.println(tm);
        System.out.println(tm.remove(110));
        System.out.println(tm);

        System.out.println(tm.pollFirstEntry());
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(103));
        System.out.println(tm.ceilingKey(105));
        Object shallowMap = tm.clone();
        System.out.println(shallowMap);
//        tm.compute(
//                101, " Java")
//        );

        System.out.println(tm.descendingKeySet());
        System.out.println(tm.floorEntry(102));
        System.out.println(tm.headMap(104));        //{101=Chetan, 103=Pranav} : not include Key given in returing map
        System.out.println(tm.higherEntry(103));       //104=Samir: return next entry to given key
        System.out.println(tm.subMap(101, 108));        //{101=Chetan, 103=Pranav, 104=Samir}

        TreeMap treeMap2 = new TreeMap();
        treeMap2.put(100, "Hundred");
        treeMap2.put("one", 1);
    }
}
