package com.mutil.threading.thread;

public class ThreadNamingDemo {
    public static void main(String[] args) {                        //JVM create the main thread
        Thread.currentThread().setName("not main");
        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("Chetan");
        t2.start();
        MyThread t3 = new MyThread();
        t3.start();
        MyThread t4 = new MyThread("4th thread");
        t4.start();
    }
}

class MyThread extends Thread{
    MyThread(String s){
        super(s);
    }
    MyThread(){

    }

    @Override
    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName());
        super.run();
    }
}
