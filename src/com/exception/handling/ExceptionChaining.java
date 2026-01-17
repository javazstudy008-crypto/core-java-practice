package com.exception.handling;

public class ExceptionChaining {
    static int a=10;
    static int b=2;
    static String str;
    public static void main(String[] args) {
        try{
            calculateValue(a, b, str);
        }catch (Exception e){
            System.out.println("Error occured inside calculateValue method...");
//            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("execution in main after try catch");

//        try{
//            show();
//        }catch(Exception er){
//            System.out.println("show method is throwing error");
//            er.printStackTrace();
//        }

    }

    static void calculateValue(int a, int b, String str){
        try{
            System.out.println(a/b);
            System.out.println(str.trim());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("after execution");
    }



//    static void show(){
//
//    }
}
