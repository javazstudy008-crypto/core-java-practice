package com.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        //Method-1: New class
        FunctionalInterfaceDemo imp = new ImplClass();
        imp.show();
        //Method2: ananumous class
        FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo() {
            @Override
            public void show() {
                System.out.println("Show method of ananomous class...");
            }
        };
        demo.show();

        //Method-3: lambda expression
        FunctionalInterfaceDemo lambdaDemo = ()-> System.out.println("Inside lambda expression");
        lambdaDemo.show();
    }
}

