package com.mutil.threading.outerr;

public class ThreadMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        //sleep(), yield(), join()
        MyThread t = new MyThread();
        t.start();
        for (int i=1; i<=10; i++){
            if(i>5){
                t.join();
            }
            System.out.println("mainThread: " + i);
            Thread.sleep(5000);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=50; i++){
            if(i%3==0){
                System.out.println("Child Thread: " + i);
                if(i>15){
//                    Thread.yield();
                }
            }
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}