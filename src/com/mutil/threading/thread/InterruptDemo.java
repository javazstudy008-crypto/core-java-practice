package com.mutil.threading.thread;

public class InterruptDemo {
    Object o;
    public static void main(String[] args)
    {
        MyThread3 t = new MyThread3();
        t.start();
        t.interrupt();                      //will only work if sleep method is used
    }
}

class MyThread3 extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("thread state interrupt: " + Thread.interrupted());      //true  ---> it will flip the nature of interrupted thread
            System.out.println("thread state interrupt: " + Thread.interrupted());
            System.out.println("thread state interrupt: " + Thread.interrupted());
            System.out.println("thread state interrupt: " + Thread.interrupted());
            System.out.println(Thread.currentThread().isInterrupted());                 //false
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i);
//                if(i>2){
//                    Thread.currentThread().interrupt();
//                }
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Intruption occured");
        }
    }
}
