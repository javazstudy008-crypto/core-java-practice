package com.brainworks.oops.abstrac;

public class FinalDemo {

    final int a;                 //way-1: intialization
    int b=10;

    {                           //instance intilization block
//        a=b;
    }

    FinalDemo(int x){           //intialise the instance related things, objects and variable
        a = x;
    }

    public static void main(String[] args) {
//        FinalDemo d = new FinalDemo();
//        System.out.println(d.a);
    }
}
