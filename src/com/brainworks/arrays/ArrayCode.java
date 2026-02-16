package com.brainworks.arrays;

import java.util.ArrayList;

public class ArrayCode {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] arr = {5,32,8,1,72};
        int min = arr[0];

        for(int num : arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Max number: " + max);

        for (int num : arr){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Min number: " + min);
    }

}
