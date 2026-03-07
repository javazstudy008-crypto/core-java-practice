package com.collection.map.hashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "String1");
        map.put(20, "String2");
        map.put(null, null);
        map.put(10, "String4");
        map.put(50, "Fifty");
//        System.out.println(map);
//
//        String value = map.get(10);
//        System.out.println(value);

//        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for(Map.Entry<Integer, String> entry: map.entrySet()){
//            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }

        Set<Integer> keySet = map.keySet();
        Iterator i = keySet.iterator();

//        while(i.hasNext()){
////            System.out.println("value is : " + map.get(i.next()));
//        }

        for(Integer key: keySet){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println(map.containsValue("Fifty"));

        System.out.println(map.getOrDefault(11, "Default value"));

        map.replace(10, "String4", "String10");

        System.out.println(map);
        if(map.containsKey(10)){
            System.out.println("medicine is available...");
        }
    }
}
