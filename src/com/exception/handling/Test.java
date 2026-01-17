package com.exception.handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1. error
//        show();

        //2. checked exception/compile-time exception
//        try{
//            FileReader fr = new FileReader("c://test.txt");
//        } catch (FileNotFoundException e){
//
//        }

        //3. unchecked exception/runtime exception
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: " );
        int a = sc.nextInt();
        System.out.println("enter a number which will divide: " );
        int b = sc.nextInt();
        try{
            int c = a/b;            //error occured, code after this won't be executed
            System.out.println(c);

            int d= a=b;
            System.out.println(d);
        }catch(Exception e){
//            e.printStackTrace();                //Exception class name; description/error msg;  stack trace

//            System.out.println(e);                  //Exception class name; description/error msg
//            System.out.println(e.getClass());       //Exception class name
            System.out.println(e.getMessage());     //description/error msg
        }
        System.out.println("after catch");
        int d = a+b;
        System.out.println(d);
    }

//    static void show(){
//        show();
//    }
}
