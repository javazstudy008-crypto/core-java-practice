package com.exception.handling;

public class ThrowKeyWord {
    public static void main(String[] args) {
        int num=-1;
        try{
            if(num<0){
                throw new CustomExceptionDemo("Number should be greater than zero");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        int age=16;
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        String firstName="admhbsdknskdbsdkcjns";
        if(firstName.length()>10){
            throw new CustomExceptionDemo("firstName cannot be of more than 10 char");
        }
    }
}
