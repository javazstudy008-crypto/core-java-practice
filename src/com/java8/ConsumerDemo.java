package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Dog12");
        map.put(11, "Dog122");
        map.put(12, "Dog121");

        Consumer<Map<Integer, String>> con = e ->{
            String a = e.get(10);
            a = a.startsWith("D") ? a.replace('D', 'B') : a.replace('D', 'C');
            map.put(10, a);
        };
        con.accept(map);

        map.keySet().stream().forEach(e->{
            System.out.println(map.get(e));
        });


        BiConsumer<Integer, String> biCon = (a, b)->{
            System.out.println(a + " " + b);
        };
        biCon.accept(10, "Hey");
    }
}
