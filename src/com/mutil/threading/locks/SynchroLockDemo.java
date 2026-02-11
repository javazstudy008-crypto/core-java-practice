package com.mutil.threading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchroLockDemo {
    public static void main(String[] args) throws InterruptedException {
        double amount=200.00;
        Threadd th1 = new Threadd(amount);
        Thread t1 = new Thread(th1, "Thread-1");
        Thread t2 = new Thread(th1, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class Threadd implements Runnable{
    Lock lock = new ReentrantLock();
    double balance=100.00;
    double amount;
    Threadd(double amount){
        this.amount=amount;
    }
    @Override
    public void run() {
        makeDeposit();
    }
    void makeDeposit() {
        System.out.println(Thread.currentThread().getName() + " entered makeDeposit");
        if(lock.tryLock()){
            try{
                System.out.println(Thread.currentThread().getName() + " aquired the lock");
                if(amount>0){
                    if(fetchingUserDetail()){
                        System.out.println("Is User Ok: " + fetchingUserDetail());
                        balance = balance+amount;
                    }
                    System.out.println(Thread.currentThread().getName()+ " : " + balance);
                    try{
                        Thread.sleep(5000);
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        } else{
            System.out.println(Thread.currentThread().getName() + " could not get the lock.. try later");
        }

    }

    boolean fetchingUserDetail(){
        try{
            Thread.sleep(2000);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}


