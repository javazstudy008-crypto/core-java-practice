package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionInterfaceJava8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(500);
        list.add(8);
        list.add(2000);
        System.out.println(list);
//        Calculationn cal = new Calculationn();
//        Result result = e -> e>50;
//        Predicate<Integer> predi = e -> e>50;
//
//        for(Integer i : list){
//            if(predi.test(i)){
////                System.out.println(i);
//            }
//        }

       List<Integer> listt =  list.stream().filter(e -> e>50).map(e -> e/10).collect(Collectors.toList());
        System.out.println(listt);

    }
}

//interface Result{
//    boolean getTrueFalse(int x);
//}

//class Calculationn implements  Result{
//
//    @Override
//    public boolean getTrueFalse(int x) {
//        return x>50;
//    }
//}
