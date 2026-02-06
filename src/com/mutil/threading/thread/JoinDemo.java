package com.mutil.threading.thread;

public class JoinDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Main thread started execution.");

        MyThread2 t1 = new MyThread2();                 //child thread of main thread
        t1.start();

        t1.join();                      // Main thread waits for child thread to finish

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Main thread: " + i);
        }
        System.out.println("Main thread ended...");
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("My is running: " + i);
        }
    }
}