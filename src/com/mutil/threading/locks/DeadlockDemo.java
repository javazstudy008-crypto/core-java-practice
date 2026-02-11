package com.mutil.threading.locks;
public class DeadlockDemo {
    public static final String THREAD_1 = "Thread-1";
    public static void main(String[] args) {
        PaymentResource resourceA = new PaymentResource();
        BookingResource resourceB = new BookingResource();

        Thread t1 = new Thread(new ThreadOne(resourceA, resourceB), THREAD_1);
        Thread t2 = new Thread(new ThreadTwo(resourceA, resourceB), "Thread-two");

        t1.start();
        t2.start();
    }
}
class ThreadOne implements Runnable {
    private PaymentResource resourceA;
    private BookingResource resourceB;
    public ThreadOne(PaymentResource resourceA, BookingResource resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }
    @Override
    public void run() {
        resourceA.startPayment(resourceB);
    }
}
class ThreadTwo implements Runnable {

    private PaymentResource resourceA;
    private BookingResource resourceB;

    public ThreadTwo(PaymentResource resourceA, BookingResource resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        resourceB.ticketBookingStart(resourceA);
        System.out.println("Thread-2");
    }
}
class PaymentResource {
    public synchronized void startPayment(BookingResource resourceB) {
        System.out.println(Thread.currentThread().getName() + " locked ResourceA" );
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to lock ResourceB");
        boolean isBookingDone = resourceB.bookingDone();
        if(isBookingDone){
            //call payment service
        }
    }
    public synchronized boolean paymentDone() {
        System.out.println(Thread.currentThread().getName() + " inside ResourceA.methodA2()");
        //line of code to check if payment is done
        return false;
    }
}
class BookingResource {
    public synchronized void ticketBookingStart(PaymentResource resourceA) {
        System.out.println(Thread.currentThread().getName() + " locked ResourceB");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to lock ResourceA");
        resourceA.paymentDone();


    }
    public synchronized boolean bookingDone() {
        System.out.println(Thread.currentThread().getName() + " inside ResourceB.methodB2()");
        return true;
    }
}
