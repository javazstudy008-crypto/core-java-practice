package com.mutil.threading.locks;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        LocalDateTime startTime = LocalDateTime.now();
        BookTicket bookTicket = new  BookTicket();
        Thread t1 = new Thread(new MyThread1(bookTicket), "thread-1");
        Thread t2 = new Thread(new MyThread2(bookTicket), "thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time taken: " + Duration.between(startTime, endTime).toMillis());
    }
}

class MyThread1 implements Runnable{
    private BookTicket bookTicket;

    MyThread1(BookTicket bookTicket){
        this.bookTicket=bookTicket;
    }
    @Override
    public void run() {
        bookTicket.ticketBooking(100);
    }
}
class MyThread2 implements Runnable{
    private BookTicket bookTicket;

    MyThread2(BookTicket bookTicket){
        this.bookTicket=bookTicket;
    }
    @Override
    public void run() {
        bookTicket.ticketBooking(100);
    }
}

class BookTicket{
    ReentrantLock lock = new ReentrantLock();
    final int ticketPrice = 100;


    public void ticketBooking(double amount) {
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    System.out.println(Thread.currentThread().getName() + " aquired the lock");
                    Thread.sleep(2000);
                    System.out.println("Welcome to book your ticket..." + Thread.currentThread().getName());
                    if (amount >= ticketPrice) {
                        proceedPayment();
                        sendTicketsMessage();
                    } else {
                        System.out.println("Ticket price is: " + ticketPrice + " recharge your account" + Thread.currentThread().getName());
                    }
                }catch (Exception e){
                    e.printStackTrace();
                } finally{
                    lock.unlock();
                }
            } else{
                System.out.println(Thread.currentThread().getName() + " tried to aquire the lock and failed... try later!!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

//        System.out.println("Welcome to book your ticket..." + Thread.currentThread().getName());
//        if(amount>=ticketPrice){
//            proceedPayment();
//            sendTicketsMessage();
//        }else{
//            System.out.println("Ticket price is: " + ticketPrice + " recharge your account" + Thread.currentThread().getName());
//        }
    }

    private void proceedPayment(){
        try{
            Thread.sleep(3000);
            System.out.println("Your payment is done: " + Thread.currentThread().getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void sendTicketsMessage(){
        try{
            Thread.sleep(1000);
            System.out.println("your movie ticket is booked..."+ Thread.currentThread().getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


