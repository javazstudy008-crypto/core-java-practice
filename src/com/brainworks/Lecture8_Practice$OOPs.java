package com.brainworks;

import com.packages.Student;

import java.util.Scanner;

public class Lecture8_Practice$OOPs {
    long fact=1;
    int rev=0;
    static int temp;

    int i=10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial wanted: ");
        Integer num = sc.nextInt();
        temp = num;

//        int k = i;
            //factorial
        Lecture8_Practice$OOPs obj1 = new Lecture8_Practice$OOPs();

//        long factorial = obj1.factorial(num);
//        System.out.println("factorial of " + num + " is: " + factorial);

//        for(int i=1; i<=num; i++){
//            fact = fact*i;
//        }
//        System.out.println(fact);


        //palindrom
        obj1.palindrom(num);

    }

//    long factorial(int num){             //5*4*3*2
//        if(num>=1){
//            fact=fact*num;          //num=5; fact=1*5=5; //num=4; fact=5*4=20 // num=3 fact=20*3=60;  //num=2; fact=60*2=120
//            factorial(num-1);
//        }
//        return fact;
//    }


    public void palindrom(int num){            //12321; //1232 // 123  //12  //1
        while(num>0){
            int rem=num%10;                 //rem=1; rem=2; rem=3; rem=2 rem= 1
            rev = rev*10+rem;               //rev=0; rem=1; rev=0*10+1 = 1;     //rev=1*10+2 = 12  //rev=12*10+3=120+3=123  //rev= 123*10+2= 1230+2=1232 //rev=1232*10+1= 12321
            num = num/10;      //num= 1232  //num= 123  //num=12  //num=1  num=0
        }
        System.out.println("rev of the number is: " + rev);

        if(rev==temp){
            System.out.println("it is a palindrom");
        }else{
            System.out.println("not a palindrom");
        }
    }

}
