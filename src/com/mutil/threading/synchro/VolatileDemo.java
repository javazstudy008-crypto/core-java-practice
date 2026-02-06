package com.mutil.threading.synchro;

class Shared {
    volatile boolean running = true;
}

public class VolatileDemo {
    public static void main(String[] args) {

        Shared shared = new Shared();

        Thread t1 = new Thread(() -> {
            while (shared.running) {
                // busy wait
            }
            System.out.println("Stopped");
        });

        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            shared.running = false;
        });

        t1.start();
        t2.start();
    }
}

