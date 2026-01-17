package com.brainworks.oops.abstrac;

public interface Remote {

    default void story(){
        System.out.println("default implementation of remote");
    };
}
