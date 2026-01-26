package com.mutil.threading.thread;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        DemoThreadd dt = new DemoThreadd();
        dt.start();
        for (int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+ " : "+ i);
        }
        System.out.println("Default Priority of main Thread...: " +Thread.currentThread().getPriority());
    }
}

class DemoThreadd extends Thread{
    @Override
    public void run() {
        DemoThreadd1 dt = new DemoThreadd1();
        dt.start();
        Thread.currentThread().setPriority(8);
        for (int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+ " : "+ i);
        }
        super.run();
    }
}

class DemoThreadd1 extends Thread {
    @Override
    public void run() {
//        Thread.currentThread().setPriority(100);            //IllegalArgumentException: priority should be in betweeen 1-10
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
        super.run();
    }
}