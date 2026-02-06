package com.mutil.threading.synchro;
public class SynchronizationDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        MyThread22 t3 = new MyThread22(c);
        t3.start();
        t3.join();
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        System.out.println(c.count); // Expected: 10000
    }
}

class Counter {
    int count = 0;

    void increment() {                   //Method level synchronization

        //100 lines
        count++;
        //100 lines
    }

//    synchronized void increment() {
//
//        //100 lines
//        synchronized (this){
//            count++;
//        }
//        //100 lines
//    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for(int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}


class MyThread22 extends Thread{
    Counter counter;

    MyThread22(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}


