package com.exception.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyWordDemo {

    public static void main(String[] args) throws FileNotFoundException{
        try{
            demo();
        }catch (Exception e){
            e.printStackTrace();
        }
        result();
        System.out.println("This is main method");
    }

    static void demo() throws FileNotFoundException{
        String file = "demo.txt";
        try{
            read(file);
        }catch(Exception e){
            System.out.println( file + " not found");
        }

        System.out.println("this is demo method");
    }

    static void read(String fileName) throws FileNotFoundException {
        FileReader fr = new FileReader(fileName);
        System.out.println("after=====");
    }

    static void result(){
        String fileName = "result.txt";
        try{
            read(fileName);
        } catch(Exception e){
            System.out.println(fileName + " not found");
        }

    }
}
