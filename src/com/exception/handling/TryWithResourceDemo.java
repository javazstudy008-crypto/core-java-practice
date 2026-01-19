package com.exception.handling;

import java.util.Scanner;

public class TryWithResourceDemo {
    public static void main(String[] args) {
        int a;
        int b;
        try(Scanner sc = new Scanner(System.in)){                   //automatically clsoe the resource: need Closable or Autoclosable interface
            System.out.println("Enter first number");
            a = sc.nextInt();
            System.out.println("Enter second number");
            b=sc.nextInt();
            int c = a/b;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
