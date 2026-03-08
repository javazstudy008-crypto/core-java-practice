package com.collection.map.hashmap;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map hashTable = new Hashtable();
        hashTable.put(10, "String");        //not int but Integer
        hashTable.put("key", 15);       //equals() and hashCode()
//        hashTable.put(null, null);
        System.out.println(hashTable);      //NullPointerException
    }
}
