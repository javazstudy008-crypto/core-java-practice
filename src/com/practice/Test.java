package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            System.out.println(10/0);
            System.out.println("world");
        }finally{
            String s = null;
            System.out.println("World");
            System.out.println(s.trim());
            System.out.println("Hello");
        }
    }


}
