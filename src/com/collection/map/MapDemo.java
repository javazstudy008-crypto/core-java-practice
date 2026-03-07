package com.collection.map;

import com.collection.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Chetan", 150);
        Employee e2 = new Employee(8, "Paean", 250);
        Employee e3 = new Employee(15, "Aman", 10);
        Employee e4 = new Employee(15, "Aman", 10);
        Map map = new HashMap();
        map.put(10, e1);
        map.put(8, e2);
        map.put(15, e3);
        map.put(8, e2);
        map.put(null, null);
        map.put("chetan", 12);
        System.out.println(map);

//        for(Object key : map.keySet()){
//            System.out.println("" + map.get(key));
//        }

//        for(Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey()+ " : " + entry.getValue());
//        }

        map.forEach((k,v)-> System.out.println(k + " : " + v));

        Set s = new HashSet();
        s.add(e3);
        s.add(e4);
        System.out.println(s.size());
        System.out.println(e3.equals(e4));
        System.out.println(e3.hashCode()==e4.hashCode());
    }
}
