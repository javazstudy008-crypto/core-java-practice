package com.collection.map.hashmap;


import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String str1 = new String("key");
        String str2 = new String("key");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        Map map = new IdentityHashMap();
        map.put(str1, "value-1");
        map.put(str2, "Value-2");

        System.out.println(map);
    }
}
