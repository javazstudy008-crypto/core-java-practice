package com.brainworks.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.RandomAccess;
import java.util.Set;

public class PracticeSession {
//        public static void main(String[] args) {
//            int []arr ={2,3,4,5,12,2,4,2}; //index: 0,1,2,3,4,5,6
////            System.out.println(arr[1]);     //length: 7
////            System.out.println(arr.length);
//            for (int i=0;i< arr.length;i++){        //i=0   //i=1
//                for (int j=i+1;j<arr.length;j++){       //j=1; j=2; j=3; j=5            //j=i+1=1+1=2; j=2
//                    if (arr[i]==arr[j]){            //arr[0]==arr[1]        //arr[0]==arr[2]  //arr[0]==arr[3]  //arr[0]==arr[5]
//                        System.out.println(arr[i]);
//                    }
//                }
//            }
//        }
//public static void main(String[] args) {
//
//    int[] arr = {2,3,2,4,5,3,5,2,6};
//
//    for(int i=0; i<arr.length ; i++)
//    {
//        int count = 1;
//        if(arr[i] == -1)
//        {
//            continue;
//        }
//        for(int j=i+1; j<arr.length; j++)
//        {
//            if(arr[i] == arr[j])
//            {
//                count++;
//                arr[j] = -1;
//            }
//        }
//        if(count > 1)
//        {
//            System.out.println(arr[i]+ " : "+count);
//        }
//    }
//}
    public static void main(String[] args) {
        Set set = new HashSet();
        int []arr ={2,3,4,5,12,2,4,2,4,4};

        for(int i=0; i< arr.length; i++){
            if(!set.add(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

//    public static void main(String[] args) {
//        int []arr ={2,3,4,5,12,2,4,2, 2,2,2,2};  //{2,2,3,4,4,5,12
//        Set set = new HashSet();
//        Arrays.sort(arr);
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]==arr[i+1]){
//                set.add(arr[i]);
//            }
//        }
//        System.out.println(set);
//    }

}
