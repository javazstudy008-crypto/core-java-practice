package com.mutil.threading.thread;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Test1 t = new Test1();
        t.start();
        for (int i=1; i<=10; i++){
            System.out.println(i);
//            Thread.sleep(-1);           //timeout value is negative
//            Thread.sleep(1000, -1);         //nanosecond timeout value out of range
        }
    }
}

class Test1 extends Thread{
    @Override
    public void run() {
        for (int i=11; i<=20; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}

