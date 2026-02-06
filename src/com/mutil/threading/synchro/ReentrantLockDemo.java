//package com.mutil.threading.synchro;
//
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//class Worker1 extends Thread {
//    ReentrantLock lockA;
//    ReentrantLock lockB;
//    Worker1(ReentrantLock lockA, ReentrantLock lockB) {
//        this.lockA = lockA;
//        this.lockB = lockB;
//    }
//    public void run() {
//        while(true){
//            try {
//                if(lockA.tryLock(2, TimeUnit.SECONDS)){
//                    try { Thread.sleep(100); } catch (Exception e) {}
//                    try {
//                        if(lockB.tryLock(2, TimeUnit.SECONDS)){
//                            System.out.println();
////                            break;
//                        }
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Worker1 acquired lockA");
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } {
//        System.out.println("Worker1 acquired lockB");
//
////        lockB.unlock();             //IllegalMonitorStateException: if unlock and again trying to unlock
////        lockA.unlock();
//    }}}
//}
//
//class Worker2 extends Thread {
//    ReentrantLock lockA;
//    ReentrantLock lockB;
//
//    Worker2(ReentrantLock lockA, ReentrantLock lockB) {
//        this.lockA = lockA;
//        this.lockB = lockB;
//    }
//
//    public void run() {
//        while (true) {
//            try {
//                if(lockB.tryLock(2, TimeUnit.SECONDS)){
//                    System.out.println("Worker2 acquired lockB");
//
//                    try {
//                        Thread.sleep(100);
//                    } catch (Exception e) {
//                    }
//
//                    try {
//                        if(lockA.tryLock(2, TimeUnit.SECONDS)){
////                            break;// WAITING FOREVER
//                        }
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Worker2 acquired lockA");
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } {
//
//
////            lockA.unlock();
////            lockB.unlock();
//        }}
//    }
//}
//
//public class ReentrantLockDemo {
//
//    public static void main(String[] args) {
////        Lock l = new ReentrantLock(true);
//        ReentrantLock lockA = new ReentrantLock();
//        ReentrantLock lockB = new ReentrantLock();
//
//        Thread t1 = new Worker1(lockA, lockB);
//        Thread t2 = new Worker2(lockA, lockB);
//
//        t1.start();
//        t2.start();
//    }
//}
