package com.exception.handling;

import java.io.IOException;

public class Demo{
    public static void main(String[] args) {
        try{
          try{
              System.out.println(10/0);
          }catch(Exception e){
              e.printStackTrace();
          }
            String s = null;
            s.trim();
        }catch(ArithmeticException e){
            String s = e.getMessage();
            System.out.println("Don't divide by zero");
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }

        System.out.println("after excusion");

    }
}
