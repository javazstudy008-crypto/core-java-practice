package com.collection.map.hashmap;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(10);
        vector.add(50);
        vector.add(30);
        vector.add(80);
        vector.add(20);
        System.out.println(vector);

        Enumeration e = vector.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
            vector.remove(1);
        }


//        List list = new CopyOnWriteArrayList();
//        list.add(10);
//        list.add(50);
//        list.add(30);
//        list.add(80);
//        list.add(20);
//
//        System.out.println(list);
//
//        Iterator<Integer> it = list.iterator();
//
//        while(it.hasNext()){
//            Integer i = it.next();
//            System.out.println(it.next());
//            list.add(2);                     //ConcurrentModificationException: since we were trying to make a change which caused structrual change of collection Object while traversing.
//        }
//
//        System.out.println(list);
    }
}
