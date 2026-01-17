package com.brainworks.oops.abstrac;

public class WhatsApp implements Notification, Remote{

    @Override
    public void likes() {

    }

    @Override
    public void comment() {
        System.out.println("this is new WhatsApp comment Hello...");
    }

    @Override
    public void share() {

    }

    public void run(){

    }

    public void story(){
        System.out.println("default implementation of instagram");
    };

    public static void main(String[] args) {
        WhatsApp w = new WhatsApp();
        Notification n1 = new WhatsApp();
        Notification n2 = new Instagram();
        n1.comment();
        n2.comment();
        n1.story();
        Notification.subscribe();
    }

}
