package com.enumpack;

enum EnumDemo {
    MONDAY, TUESDAY, FRIDAY;
    EnumDemo(){

    }
    static void anyMethod(){                        //need to make static so that you call by enum name
        System.out.println("This is enum method");
    }
    void getCount(){                        //need to make static so that you call by enum name
        System.out.println("This is enum method");
    }
}


