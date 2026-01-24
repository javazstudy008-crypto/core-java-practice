package com.mutil.threading.thread;

import java.util.concurrent.Callable;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
//        td.run();
//        td.jump();

        td.show();                          //context switching
        td.show();
        td.show();
        td.show();
        td.show();
    }

    void show(){
        //Thread execusion
        PlayTimer pt1 = new PlayTimer();     //1. Thread is born: Object creation when Thread class is use
        pt1.start();                        //2. In runnable state
        //        pt1.start();               //Cannot use same thread once it's dead. I'll give IllegalThreadStateException
        PlayTimer pt2 = new PlayTimer();
        pt2.start();
        PlayAudio pa1 = new PlayAudio();
        pa1.start();
//        PlayAudio pa2 = new PlayAudio();
//        pa2.start();
        PlayVideo pv = new PlayVideo();    //Object creation when Runnable interface is use
        Thread th = new Thread(pv);         //it will run, run method of PlayVideo class whose reference(pv) is getting passed
        th.start();
    }

//Simple Methods
//    void run(){
//        System.out.println("run");
//    }
//
//    void jump(){
//        System.out.println("Jump");
//    }
}
