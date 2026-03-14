package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supp = ()->"Hello world";
        String str = supp.get();
        System.out.println(str);

        Predicate<Integer> p = e -> e%2==0;
        Function<Integer, Integer> f = e -> e*2;
        Consumer<Integer> c = e-> System.out.println(e);
        Supplier<Integer> sup = ()-> 50;

        if(p.test(sup.get())){
           c.accept(f.apply(sup.get()));
        }

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(500);
        list.add(8);
        list.add(2000);

        list.stream().filter(e->e>50).collect(Collectors.toList());     //collect: internally use Supplier.
    }
}
