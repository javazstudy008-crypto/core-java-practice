package com.brainworks;

//import com.packages.Student;

import com.packages.Student;

public class Lecture3 {
//    int a =10;
//    Integer i = 22;
    //        Integer = new Integer();        //not allowed
//        Integer i2 = new Integer(5);  //not allowed
//    Integer b = Integer.valueOf(a);
//    String s = new String();
//    Integer i3 = null;
//        int c = null;                 //not allowed

    public static void main(String[] args) {
        // Operators in Java: helps to math operation in java
//        int a =10;
//        int b=7;

//        System.out.println(++a);        //a=11
//        System.out.println(a++);        //a=11
//        System.out.println(a);          //a=12
//        System.out.println(a--);        //a=12, 11
//        System.out.println(--a);        //a=10

        //relational operator
//        System.out.println(10==12);     //boolean: false
//        System.out.println(12>=12);     //true
//        System.out.println((10==10 && 12>=15));   //false
//        System.out.println(10==10 || 12>=15);   //true

        //assignment operator
//        System.out.println(a+=20);  //a = 30;
//        System.out.println(a+=b);   //a=a+b;
        //ternary operator
//        int c = a>b ? a : b;
//        System.out.println(c);      //10

        //instanceof operator
//        Student s1 = new Student();
//        System.out.println(s1 instanceof Student);

        //Bitwise operator
//        System.out.println(2&3);

        //Precedence
//        System.out.println(10*5/5+8);           //BODMAS  (10*1+8) --> (10+8) -->18
                                                //left to right = (50/5+8) --> (10+8) -->18

//        int a = 10;
//        System.out.println((a++)*5%2);      //25  (10*5%2) --> (50%2) --> 0

//        System.out.println((++a)*5%2);        //1  (11*5%2) --> (55%2) --> 1

        int b1 = 5;
        short b2 = 10;
        int sum = b1*b2;
        char c1 = 'a';
        char c2 = 'A';
        System.out.println(c1+c2);                  //ASCII value

//        float f1 = 10.20f;
//        double d1 = 20.20;
//        Double d2 = f1+d1;                   //typecasting
//        System.out.println(d2 instanceof Double);
//        System.out.println(i);
//        String s = new String();   //in

    }

    public String getResult(Double avgMarks){
        if(avgMarks>90){
            return "Excellent";
        }else if(avgMarks<90 && avgMarks>75){
            return "Good";
        } else if(avgMarks<75 && avgMarks>50){
            return "can be better";
        }else {
            return "need improvment";
        }
    }
}
