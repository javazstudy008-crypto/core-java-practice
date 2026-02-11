//package com.mutil.threading.locks;
//
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Demo {
//    public static void main(String[] args) {
//        ResourceAA resourceA = new ResourceAA();
//        ResourceBB resourceB = new ResourceBB();
//
//        Thread t1 = new Thread(new Thread1(resourceA, resourceB), "Thread-1");
//        Thread t2 = new Thread(new Thread2(resourceB, resourceA), "Thread-2");
//
//        t1.start();
//        t2.start();
//    }
//}
//
//class Thread1 implements Runnable{
//    ResourceAA resourceA;
//    ResourceBB resourceB;
//
//    Thread1(ResourceAA resourceA, ResourceBB resourceB){
//        this.resourceA = resourceA;
//        this.resourceB = resourceB;
//    }
//
//    @Override
//    public void run() {
//        resourceB.bookTicket(resourceA);
//    }
//}
//
//class Thread2 implements Runnable{
//    ResourceAA resourceA;
//    ResourceBB resourceB;
//
//    Thread2(ResourceBB resourceB, ResourceAA resourceA){
//        this.resourceA = resourceA;
//        this.resourceB = resourceB;
//    }
//
//    @Override
//    public void run() {
//        resourceA.showResult(resourceB);
//    }
//}
//
//class ResourceA{
//    final Lock lock = new ReentrantLock();
//    public boolean showResult(ResourceBB resourceB) {
//        try {
//            if (lock.tryLock(8, TimeUnit.SECONDS)) {
//                try {
//                    System.out.println("welcome to result...");
//                    if (resourceB.doneTicketBooking()) {
//                        System.out.println("start to result...");
//                        return true;
//                    } else {
//                        System.out.println("show not finished yet...");
//                    }
//                } finally {
//                    lock.unlock();
//                }
//            } else {
//                System.out.println("could not acquire result lock...");
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        return false;
//    }
//
//    public boolean doneResult() {
//        try {
//            if (lock.tryLock(1, TimeUnit.SECONDS)) {
//                try {
//                    System.out.println("result is done...");
//                    return true;
//                } finally {
//                    lock.unlock();
//                }
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        return false;
//    }
//}
//
//class ResourceB{
//    final Lock lock = new ReentrantLock();
//    public void bookTicket(ResourceAA resourceA) {
//        try {
//            if (lock.tryLock(1, TimeUnit.SECONDS)) {
//                try {
//                    System.out.println("welcome to movie...");
//                    if (resourceA.doneResult()) {
//                        System.out.println("you can check the result now...");
//                    } else {
//                        System.out.println("result not ready, please wait...");
//                    }
//                } finally {
//                    lock.unlock();
//                }
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//    }
//
//    public boolean doneTicketBooking() {
//        try {
//            if (lock.tryLock(1, TimeUnit.SECONDS)) {
//                try {
//                    System.out.println("show is done...");
//                    return true;
//                } finally {
//                    lock.unlock();
//                }
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        return false;
//    }
//}
//
