package com.exception.handling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent{


//    @Override
//    public void show() throws IOException{
////        throw new Exception();
//    }


    @Override
    public void result() throws IOException{              //not allowed: since parent is throwing IO which is child of Exception and here CHild class is throwing parent of IOExceptio
        throw new FileNotFoundException("abc.txt");
    }

//    @Override
//    public void result() throws FileNotFoundException {              //allowed: since parent is throwing IO which is parent of FileNotFoundException and here CHild class is throwing child exception
//
//    }
}
