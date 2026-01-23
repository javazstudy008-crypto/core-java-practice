package com.practice;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
//        String str = "Java";                //avaJ; length= 4; last char index=3
//        String rev = "";
//
//        for(int i=str.length()-1; i>=0; i--){       //i=3; i=2; i=1 ; i=0
//            rev= rev + str.charAt(i);                 //rev="" --> rev="a"  //rev=a --> rev=a+v="av"// rev=ava //rev=avaJ
//        }
//        System.out.println(rev);


//        reversal of String str = "Java is Awasome"  ==       i=7

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        String rev = "";
        System.out.println(str);

//        String[] arr = str.split(" ");  //{"Java", "is", "Awasome"}
//        for(int i= arr.length-1; i>=0; i--){
//            System.out.print(arr[i]);
//        }
        while(rev==""){
            for(int i=str.lastIndexOf(" ")+1; i<str.length(); i++){
                rev=rev+str.charAt(i);
            }
            System.out.println(rev);
        }
    }
}


//    *
//   **
//  ***
// ****
//*****
