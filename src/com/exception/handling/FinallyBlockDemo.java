package com.exception.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ResourceBundle;
import java.util.Scanner;

public class FinallyBlockDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
//            ResourceBundle fr = new ResourceBundle("demo.txt");
            int c = 10/0;                   //Arithmatical
            String str = "Chetan";              //null pointer
            System.out.println(str.trim());
//            show();
        }
//        catch(NullPointerException e){
//            e.printStackTrace();
//            System.out.println("exception in main method");
//        }
        finally {
            try{
                System.out.println(10/0);
            }catch(Exception e){

            }
            finally{
                System.out.println("this is finally block");
                sc.close();
            }

        }
        System.out.println("outside");

    }

    static int show(){
        try{
            int c = 10/5;
            return c;
        }finally {
            System.out.println("inside show finally");
        }
    }
}
