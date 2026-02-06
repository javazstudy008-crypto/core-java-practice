package com.mutil.threading.synchro;

import java.util.concurrent.atomic.AtomicInteger;


class Counterr {
//    volatile int count = 0;
    AtomicInteger count = new AtomicInteger(0);
    void increment() {
//        count++;   // NOT atomic
        count.incrementAndGet();
    }
}

class MyThread1 extends Thread {
    Counterr counter;

    MyThread1(Counterr counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}

class MyThread2 extends Thread {
    Counterr counter;

    MyThread2(Counterr counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}

public class AtomicIntegerDemo {

    public static void main(String[] args) throws InterruptedException {

        Counterr counter = new Counterr();

        Thread t1 = new MyThread1(counter);
        Thread t2 = new MyThread2(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
