package com.brainworks;

public class Patterns {
    public static void main(String[] args) {
//****                 //i=rows //j=columns
//****


//        for(int i=1; i<=2; i++){
//            for(int j=1; j<=4; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }

        //=======================================================
//    *             //i=wow; j=column
//    **
//    ***
//    ****
//    *****

//        for(int i=1; i<=5; i++){    //i=1; i=2; i=3; i=4
//            for(int j=1; j<=i; j++){        //i=1; j=2;  //i=2, j=1; i=2, j=2; i=2, j=3 //i=3, j=1; i=3, j=2
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //=========================================

//*****             //i=5
//****              //i=4
//***
//**
//*
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
