package com.java8;

import com.collection.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        Employee e1 = new Employee(3221, "Rakesh", 125);
        Employee e2 = new Employee(3222, "Rohan", 128);
        Employee e3 = new Employee(3223, "Aman", 150);
        Employee e4 = new Employee(3224, "Kartik", 165);
        Employee e5 = new Employee(3225, "Mehul", 185);
        Employee e6 = new Employee(3230, "Shreshth", 200);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

//        List<Integer> salary = employeeList.stream().map(e-> e.getSalary()).toList();
//        System.out.println(salary);
//
//        //create stream using generate
//        Stream<Integer> stream = Stream.generate(()->5);
//        System.out.println(stream.limit(20).toList());
//
//        //create stream using iterate
//        Stream<Integer> itrStream = Stream.iterate(5, e->e+1);
//        System.out.println(itrStream.limit(20).skip(4).toList());
//
//        List<Integer> li = Arrays.asList(10, 20, 50, 70, 8, 2);
//        //sorting
//        li.stream().sorted().forEach(System.out::println);

        employeeList.stream().map(e->e.getSalary()).sorted().skip(employeeList.size()-2).limit(1).forEach(System.out::println);
//        System.out.println(i);
        List<Employee> slaries = employeeList.stream().sorted((a,b)-> -a.getSalary()-b.getSalary()).limit(2).skip(1).toList();
        System.out.println(slaries);
    }
}
