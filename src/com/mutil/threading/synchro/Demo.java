package com.mutil.threading.synchro;

public class Demo {
    public static void main(String[] args) {
        MyThreaddd mt = new MyThreaddd();
        mt.start();
        System.out.println(mt.sum);
    }
}


class MyThreaddd extends Thread{
    int sum=0;
    @Override
    public void run() {
        show();
    }

    void show(){
        for (int i=1; i<=10; i++){
            sum=sum+100;
        }
    }
}

