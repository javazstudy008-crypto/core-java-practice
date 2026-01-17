package com.brainworks.oops.abstrac;

public class LoopDemo {
    static int count=1;         //if count intialise with 1; count=12
    static int i;

    public static void main(String[] args){

        for(i=1; i<=11; i++){           // dry run: i=1: true
            count++;        //original: count=1 , now count=2
            break;          //break will break the loop, no increment
        }
        System.out.println(count);  //count=2
        System.out.println(i);      //i=1


//        for(i=0; i<=10; i++){           //0,1,2,3,4,5,6,7,8,9,10 = 11 for loop also and for count
//            count++;
//        }
//
//        System.out.println(count);		//
//        System.out.println(i);

    }
}
