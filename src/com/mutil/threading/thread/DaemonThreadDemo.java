package com.mutil.threading.thread;

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread: " + Thread.currentThread().isDaemon());
//        Thread.sleep(5000);
        Test t = new Test();
        t.setDaemon(true);                    //background work: if all main execution is complete--> Daemon thread may or may not be executed because JVM closes Daemon thread if all working thread are dead
        t.start();
//        t.setDaemon(true);        //IllegalThreadStateException: always set Daemon before you start the Thread.
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("test thread: " + t.isDaemon());
    }
}
class Test extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Before============");
            for(int i=12; i<=20; i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
            System.out.println("After============");
        } catch (Exception e){
            e.printStackTrace();
        }
//        MyThread1 mt = new MyThread1();
//        mt.start();
        System.out.println("Test Thread...");
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1 isDaemon: " + Thread.currentThread().isDaemon());
    }
}

