package com.mutil.threading.synchro;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LocksDemo {
}

class MyThread3 extends Thread{
    Resource r1;
    Resource r2;

    MyThread3(Resource r1, Resource r2){
        this.r1=r1;
        this.r2=r2;
    }

    @Override
    public void run() {
        while(true){
            try{
                if(r1.lock.tryLock(2, TimeUnit.SECONDS)){
                    System.out.println("Resource 1 locked...");
                    Thread.sleep(1000);
                }try{
                    if (r2.lock.tryLock(2, TimeUnit.SECONDS)) {
                        System.out.println("resource-2 locked");
                        break;
                    }
                }finally{
                    r2.lock.unlock();
                    System.out.println("`dcasdassccwecacadsda");
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                r1.lock.unlock();
                System.out.println("r1 released lock");
            }
        }
    }
}


class Resource{
    public ReentrantLock lock = new ReentrantLock();
}