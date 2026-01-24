package com.mutil.threading.thread;

public class AnonymousClassDemo {

    public static void main(String[] args) {
        Thread th = new Thread(){                               //Anonymous class
            @Override
            public void run() {
                System.out.println("I'm a thread");
                super.run();
            }
        };
        th.start();

    }
}
