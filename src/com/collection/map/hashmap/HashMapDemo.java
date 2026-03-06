package com.collection.map.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "String1");
        map.put(20, "String2");
        map.put(null, null);
        map.put(10, "String3");
        map.put(10, "String5");
        map.put(10, "String4");
        map.put(null, null);
        System.out.println(map);

        System.out.println(map.get(10));
        Set keySet = map.keySet();
        System.out.println(keySet);
        Set entrySet = map.entrySet();                 //a pair of Key:Value is called an Entry

        //Way-1: keySet
//        for(Integer s : map.keySet()){
//            System.out.println(s + " : " + map.get(s));
//        }
//
//        //way-2: entrySet
//        for(Map.Entry entry: map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        //way-2: map forEach --> java-8
//        map.forEach((k,v)-> System.out.println(k + " : " + v));

        map.remove(10);
        map.size();
        System.out.println(map.size());
        System.out.println(map.containsKey(20));
//        Collections.synchronizedMap(map);
    }
}
