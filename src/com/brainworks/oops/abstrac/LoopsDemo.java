package com.brainworks.oops.abstrac;

public class LoopsDemo {
    //3,5,6,9,10,12,15,18,20
    public static void main(String[] args) {
        for(int i=3; i<=20; i++){
            if(i%3==0 || i%5==0){               //way-1
                System.out.println(i);
            }
//            else if(i%5==0) {                 //way-2
//                System.out.println(i);
//            }
        }
    }

}
