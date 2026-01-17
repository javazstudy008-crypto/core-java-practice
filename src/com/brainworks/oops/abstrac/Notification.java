package com.brainworks.oops.abstrac;

public interface Notification extends SocialMedia, Papper{

    int noOfLikes=10;
    void comment();

    default void story(){
        System.out.println("default implementation of instagram");
    };

    static void subscribe(){
    };


    private void getDate(){
    }
}
