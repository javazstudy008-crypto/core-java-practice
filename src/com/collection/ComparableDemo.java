package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(25);
        list.add(1);
        list.add(150);
        list.add(8);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Employee e1 = new Employee(10, "Chetan", 150);
        Employee e2 = new Employee(8, "Paean", 250);
        Employee e3 = new Employee(15, "Aman", 10);


        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        System.out.println(employees);
        Collections.sort(employees, new SalaryComparator());
        System.out.println(employees);
    }
}
