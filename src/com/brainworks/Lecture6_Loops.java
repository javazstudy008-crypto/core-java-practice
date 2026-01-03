package com.brainworks;

import java.util.Scanner;

public class Lecture6_Loops {
    public static void main(String[] args) {
        //1. if
        //2.if else
        //3. if else chain
//        int a = 9;
//        if(a>=10){
//            System.out.println("double digit");
//        } else{
//            System.out.println("single digit");
//        }

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter sub1 marks");
//        int mark1 = sc.nextInt();
//        System.out.println("Enter sub2 marks");
//        int mark2 = sc.nextInt();
//        System.out.println("Enter sub3 marks");
//        int mark3 = sc.nextInt();
//        System.out.println("Enter sub4 marks");
//        int mark4 = sc.nextInt();
//        System.out.println("Enter sub5 marks");
//        int mark5 = sc.nextInt();
//        double avgMarks = (mark1+mark2+mark3+mark4+mark5)/5;
//        System.out.println("avgMarks are: " + avgMarks);
//
//        if(avgMarks>=90){
//            System.out.println("Excellent");
//        }else if(avgMarks<90 && avgMarks>=75){
//            System.out.println("good");
//        } else if (avgMarks<75 && avgMarks>=50) {
//            System.out.println("can improve");
//        }else{
//            System.out.println("need more practice: less marks");
//        }
        System.out.println("Enter your number: ");
        int input = sc.nextInt();
        String str = switch (input){
            case 8 ->  "Monday";
            case 9 ->  "Tuesday";
            default ->  "enter valid number12";
        };
        System.out.println(str);


//        for(int i=0; i<=5; i++){
//            for(int j=0; j<=i; j++){
//                System.out.println(j);
//            }
//        }
    }
}
