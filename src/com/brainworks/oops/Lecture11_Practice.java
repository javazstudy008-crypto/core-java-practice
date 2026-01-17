package com.brainworks.oops;

public class Lecture11_Practice {
    private static int a=10;
    private int b=20;
    public static void main(String[] args) {
        System.out.println(a);
//        System.out.println(b);
        Lecture11_Practice obj = new Lecture11_Practice();
        obj.showParameter();
    }

    public void showParameter(){
        System.out.println(a);
        System.out.println(b);
    }
}
