package com.mutil.threading.thread;

public class LifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();                    //born
        t.start();                                  //runnable   --> internally run() method called  //running state
//        t.start();                              //dead thread
        Thread.sleep(1000);                 //non-running state
    }
}
