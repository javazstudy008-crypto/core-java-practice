package com.brainworks;

import com.packages.Student;

import java.util.Scanner;

public class Lecture2 {

    public int a=10;
//    public static Integer b=300;

    public static void main(String[] args){
        //scanner
//            Student s = new Student();
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Your age ");
//            int age = sc.nextInt();
//            System.out.println("Enter Your name ");
//            String name = sc.next();
//            checkAge(age, name);
        //Operators
           int sum = 15%2;
        System.out.println("sum: " + sum);
    }

    private static void checkAge(int age, String naam){
        if(age>18){
            System.out.println(naam + " :Eligible to vote");
        } else{
            System.out.println("not eligible to vote: " + naam);
        }
    }
}
