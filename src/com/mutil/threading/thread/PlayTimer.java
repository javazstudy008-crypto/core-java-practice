package com.mutil.threading.thread;

public class PlayTimer extends Thread{              //Thread: java.lang
    @Override
    public void run() {                     //3. Running state
        for(int i=21; i<=30; i++){
            System.out.println(i);
        }
//        System.out.println("execute the timer");
        super.run();
    }
}
