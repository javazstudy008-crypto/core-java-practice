package com.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
//        List<Integer> intList = Arrays.asList(10,15,8,5,55,65,55,99,15);
//        List lis = intList.stream().sorted((a,b)->b-a).toList();
//        List lis = intList.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(lis);


        //FlatMap
//        List<List<String>> ABC_items = Arrays.asList(Arrays.asList("Eggs","Banana", "Panner"),
//                                                        Arrays.asList("Onion", "Potato"),
//                                                        Arrays.asList("water", "cream"));
//        List list = ABC_items.stream().flatMap(e->e.stream()).distinct().collect(Collectors.toList());
//        System.out.println(list);

        //Terminal operator
        //reduce
        List<Integer> intList = Arrays.asList(10,15,8,5,55,65,55,99,15);            //short-circuiting
        Integer sum = intList.stream().distinct().reduce((a,b)->a+b).get();
        System.out.println(sum);

        //allMatch, anyMatch
        System.out.println(intList.stream().allMatch(e->e>7));
        System.out.println(intList.stream().anyMatch(e->e>100));
        System.out.println(intList.stream().noneMatch(e->e>100));

        Integer min = intList.stream().min((a,b)->a-b).get();
        System.out.println(min);
        Integer max = intList.stream().max((a,b)->a-b).get();
        System.out.println(max);

        List<Integer> result = intList.stream()
                .filter(n -> n > 60 && n < 70)
                .collect(Collectors.toList());
        System.out.println(result);

        //===================================================================
        //Stream creation: builder design pattern
        Stream stream= Stream.builder().build();

        //Stream methods
        Stream stream2= Stream.empty();
        Stream stream3= Stream.of(10,15,22,25,85);

    }
}
