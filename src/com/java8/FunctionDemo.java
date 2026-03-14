package com.java8;

import com.collection.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FunctionDemo {
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

//        Function<Employee, String> func = e -> e.getEmployeeName();
//        UnaryOperator<Integer> uni = e->e*2;
//
//        for(Employee e : employeeList){
//            System.out.println(func.apply(e));
//        }

        List<String> empName = employeeList.stream().map(e -> e.getEmployeeName()).toList();
        System.out.println(empName);

        //BiFunction
        BiFunction<Integer, Integer, Integer> biFun = (a,b)-> a+b;      //same
//        BinaryOperator<Integer> biFun = (a,b)-> a+b;                    //same
    }
}

//interface GetEMployeeName{
//    String getNameEmployee(Employee e);
//}


//class emp implements GetEMployeeName{
//    public String getNameEmployee(Employee e){
//        return e.getEmployeeName();
//    }
//}



//[10,8,15,12]
//[8,10,12,15]
















