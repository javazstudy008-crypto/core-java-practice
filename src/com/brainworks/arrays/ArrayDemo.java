package com.brainworks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr;                   //Declaration
//        intArr = {4,5,8,79};          //not allowed
//        int intArrr[];
//        intArr = new int[5];            //creation of Array
//        int[] intAr = new int[]{5,2,8,7,9};       //one more way of creation

        //setting the value to array:
        //way-1
//        intArr[0]=88;
//        intArr[1]=81;
//        intArr[2]=98;
//        intArr[3]=55;
//        intArr[4]=1;

        //Creating String Array
        String[] strArr = new String[5];            //way-2

        //we can set the value in an Array while intialization
        String[] arr = {"Raj", "Aman", "Ria", "Ram"};           //Object created in String literal pool

        //way-2 to fill the data in an Array
        for (int i=0; i< strArr.length; i++){
            System.out.println("Enter your String: ");
            strArr[i]=sc.next();                    //Object creted and stored in heap memory not in String literal pool
        }

        //Getting the data
        //way-1
//        System.out.println(intArr[1]);
//        System.out.println(intArr[2]);

        //way-2
//        for(int index=0; index<intArr.length; index++){             //0,1,2,3,4
//            System.out.println(intArr[index] + " ");
//        }

        //way-3
//        for(String element : strArr){
//            System.out.print(element + " ");
//        }

        //way-4
        System.out.println(Arrays.toString(strArr));
    }
}
