package com.brainworks.arrays;

import java.util.Scanner;

public class Multi_D_Array {
    //int[] intArr = new int[]{5,8,7,9,5};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2 = new int[3][2];
//        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] arr2 = {{1,2},{3,4},{5,6}};
//        int[][] arr1 = new int[3][2];
//        int[][] arr2 = new int[3][];
//        int[][] arr3 = new int[][3];            //not allowed

        //way-1 to write the data
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][1] = 5;

        //Way-2: using loops:
        for(int row=0; row<arr2.length; row++){
            for(int col=0; col<arr2[row].length; col++){
                arr2[row][col]=sc.nextInt();                //setting the value
            }
        }


        //how to print data
//        for(int row=0; row<arr2.length; row++){
//            for(int col=0; col<arr2[row].length; col++){
//                System.out.print(arr2[row][col] + " ");     //getting the value
//            }
//            System.out.println();
//        }

        for (int[] intAr : arr2){
            for(int element : intAr){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

/*
1 2 3           -->row-0
4 5 6           -->row-1
7 8 9           -->row-2
 */

/*
1 2             -->row-0
3 4             -->row-1
5 6             -->row-2
 */