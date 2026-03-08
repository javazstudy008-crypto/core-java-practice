package com.java8;

public interface CalculatorInterface{
    int getCalculation(int a, int b);
}

class Calculation{
    public static void main(String[] args) {
//        CalculatorInterface add = (a, b) -> a+b;
//        System.out.println(add.getCalculation(10, 5));
//
//        CalculatorInterface sub = (a, b) -> a-b;
//        System.out.println(sub.getCalculation(10,5));
//
//        CalculatorInterface multi = (a, b) -> a*b;
//        System.out.println(multi.getCalculation(5,2));

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=10; i++){
                    System.out.println(Thread.currentThread().getName()+ " : " + i);
                }
            }
        };
        Thread thread = new Thread(runnable, "Thread-0");
        thread.start();
        System.out.println("====================================================");
        //Thread creation using lambda expression
        Runnable runn = ()->{
            for(int i=1; i<=10; i++){
                System.out.println(Thread.currentThread().getName()+ " : " + i);
            }
        };
        Thread th = new Thread(runn, "Thread-1");
        th.start();
    }
}