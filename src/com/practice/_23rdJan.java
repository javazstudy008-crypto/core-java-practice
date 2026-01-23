package com.practice;

public class _23rdJan {
    public static void main(String[] args) {

      //=====================Operators======================
        //        String s1 = "Bright"; String s2 = "Day";
//        int i=10, j=20;

//        System.out.println("i+j");				//i+j
//        System.out.println(i+j);					//30
//        System.out.println(s1+i);					//Bright10
//        System.out.println(s1+i+j);				//Bright1020---> (s1+i)+j
//        System.out.println(s1+(i+j));               //Bright30
//        System.out.println(i+j+s1);                     //30Bright
//        System.out.println(i+j*5+s1);				//1020Bright(Amey) -->i+20*10+s1-->i+100+s1 --> 110Bright
//        System.out.println(i+j*5-20+s1);
//        System.out.println(i+j*5-(20/2*2)+s1);   //i+j*5-(10*2)+s1 --> i+j*5-20+s1 --> i+20*5-20+s1-->i+100-20+s1 -->110-20+s1 -->90Bright
//        System.out.println(s1+i*j);				//Bright200
//        System.out.println(s1+i-20);          //Bright10-20
//        System.out.println(s1+i+j+s2);          //Bright1020Day




    }
}

//Question:2
/**
 * public static void main(String[] abc){
 *         show(i);
 *         System.out.println(i);              //10
 *     }
 *
 *     static void show(int i){
 *         i=50;
 *     }
 */


//Q3
/*
public static void main(String[] abc){
        System.out.println(show());
    }

    static int show(){
        int b=10;
        return ++b;
    }
 */

//Q4: count logic
/*
    int count;
    Test(){
        count++;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        t1.show();              //1
        t2.show();              //1
        t3.show();              //1
    }
    void show(){
        System.out.println(count);
    }
 */