package com.mutil.threading.thread;

public class PlayVideo implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}
