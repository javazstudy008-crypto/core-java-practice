package com.brainworks.oops.abstrac;

import java.util.Scanner;

public class StringDemo {                   //2,4,5,6,7,8,10,12,14,15
    public static void main(String[] args) {
        String s1 = "Atul";
        String s2 = new String("Atul");

        Scanner sc = new Scanner(System.in);                //Atul
        System.out.println("Enter your string: ");
        String s3= sc.nextLine();

        String s5 = "Atul";

        boolean result1 = s1==s2;			//false,
        boolean result2 = s1.equals(s2);	//true
        boolean result3 = s1==s3;			//false
        boolean result4 = s1.equals(s3);    //true
        System.out.println("s1==s5: " + (s1==s5));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

//        switch(result1){
//            case true:
//                System.out.println("true");
//            case false:
//                System.out.println("false");
//            default:
//                System.out.println("true, false");
//        }
    }
}
