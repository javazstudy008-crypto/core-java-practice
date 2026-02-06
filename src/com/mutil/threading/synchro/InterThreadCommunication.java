package com.mutil.threading.synchro;

public class InterThreadCommunication {

    public static void main(String[] args) throws InterruptedException {
        MyyThread me = new MyyThread();
        me.start();
        System.out.println(me.sum);
        synchronized(me)
        {
            me.wait();                                      // Wait until MyyThread thread notifies
//            me.join();
            System.out.println("Total sum " + me.sum);
        }
        System.out.println("Total sum " + me.sum);
    }
}

class MyyThread extends Thread
{
    int sum;
    @Override
    public void run()
    {
        synchronized(this){
            for (int i=1; i<=10; i++){
                sum=sum+100;
                this.notify();
            }
        }
    }
}