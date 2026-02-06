package com.mutil.threading.thread;

public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main p: " + Thread.currentThread().getPriority());
        MyyThread mtt = new MyyThread();
        mtt.start();
//        Thread.yield();
        for(int i=1; i<=5; i++){
            System.out.println("main thread" + i);
        }
    }
}

class MyyThread extends Thread{
    @Override
    public void run() {
        Demo d = new Demo();
//100 lines of code, now I feel any priority thread can work
        Thread.yield();            //just a check
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("Myy pri: " + Thread.currentThread().getPriority());
        d.demoDemo();
    }
}


class Demo {
    void demoDemo(){
        for(int i=6; i<=10; i++){
            System.out.println("my thread" + i);
        }
    }
}
