package com.mutil.threading.synchro;

public class DeadlockDemo {
        public static void main(String[] args) {
            Object resourceA = new Object();
            Object resourceB = new Object();

            Thread t1 = new ThreadOne(resourceA, resourceB);
            Thread t2 = new ThreadTwo(resourceA, resourceB);

            t1.start();
            t2.start();
        }
}

class ThreadOne extends Thread {
    private Object resourceA;
    private Object resourceB;
    public ThreadOne(Object resourceA, Object resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }
    public void run() {                     //Thread-1 --> A -->(B)  //Thread-2 --> B -->(A)
            synchronized (resourceA) {
                System.out.println("ThreadOne: Locked ResourceA");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadOne: Waiting for ResourceB");
                synchronized (resourceB) {
                    System.out.println("ThreadOne: Locked ResourceB");
                }
            }
    }
}

class ThreadTwo extends Thread {

    private Object resourceA;
    private Object resourceB;

    public ThreadTwo(Object resourceA, Object resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }
    public void run() {
        synchronized (resourceA) {
            System.out.println("ThreadTwo: Locked ResourceB");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("ThreadTwo: Waiting for ResourceA");
            synchronized (resourceB) {
                System.out.println("ThreadTwo: Locked ResourceA");
            }
        }
    }
}

