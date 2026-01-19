package com.exception.handling;

import java.io.IOException;

public class CustomExceptionDemo extends RuntimeException {

    CustomExceptionDemo(String msg){
        super(msg);
//        System.out.println(msg);
    }

}
