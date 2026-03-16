package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(50);
//        list.add(80);
//        list.add(70);
//        list.add(20);
//
//        List<Integer> storeList = new ArrayList<>();

        //no >20
//        for(Integer num : list){
//            if(num>20){
//                storeList.add(num);
//            }
//        }
//        System.out.println(storeList);

        //no >20: using stream api
        List<Integer> list = List.of(10,20,5,8,7,20);
        List<Integer> list2 = Arrays.asList(10,20,50,70,8,2);

        list2.stream().filter(e->e%10==0).map(e->e*2).forEach(System.out::println);

        List<Integer> filteredList = list.stream().filter(e->e>20).collect(Collectors.toList());
//        System.out.println(filteredList);

        list.stream().filter(e -> e%2==0).forEach(e->{
            if(e>10){
                System.out.println(e/2);
            }else{
                System.out.println(e);
            }
        });

        List li = list.stream().map(e -> (e+5)*2).collect(Collectors.toList());
        System.out.println(li);
    }
}
