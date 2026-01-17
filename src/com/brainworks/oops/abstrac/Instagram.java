package com.brainworks.oops.abstrac;

public class Instagram implements Notification{

    @Override
    public void likes() {

    }

    public void comment(){
        System.out.println("instagram comment");
    }

    @Override
    public void share() {

    }

    @Override
    public void run() {

    }

    public void story(){
        System.out.println("you can post story now");
    }
}
