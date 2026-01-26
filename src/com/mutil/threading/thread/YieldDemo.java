package com.mutil.threading.thread;

public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("main p: " + Thread.currentThread().getPriority());
//        Thread.yield();                //hint the thread scheduler that I can stop my execution for some time
        MyyThread mtt = new MyyThread();
        mtt.start();
        Thread.yield();
//        mtt.join();

        for(int i=1; i<=10; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }

    }
}

class MyyThread extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("Myy pri: " + Thread.currentThread().getPriority());
        for(int i=11; i<=20; i++){
//            try{
//                Thread.sleep(1000);
//            } catch (Exception e){
//                e.printStackTrace();
//            }
            System.out.println(i);
        }
    }
}
