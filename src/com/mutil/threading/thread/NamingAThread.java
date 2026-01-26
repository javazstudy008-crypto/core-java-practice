package com.mutil.threading.thread;

public class NamingAThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        DemoThread dt = new DemoThread();                   //Thread-0
        dt.start();
        DemoThread dt1 = new DemoThread();                  //Thread-1
        dt1.start();
        dt1.setName("New Thread");
        DemoThread dt2 = new DemoThread();                  //Thread-1
        dt2.start();
    }
}

class DemoThread extends Thread{

//    DemoThread(String s){                             //can name a Thread using constructor parameter
//        super(s);
//    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("DemoThread.....");
        super.run();
    }
}
