package com.java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void show();                    //Single Abstract Method (SAM)

    default void show2(){
        System.out.println("Functional interface default method..");
    }
    default void show3(){
        System.out.println("Functional interface default method..");
    }

    static int getResult(){
        return 100;
    }
    static int getResult2(){
        return 100;
    }

    @Override
    public boolean equals(Object obj);
}

interface fun{
    default void show2(){
        System.out.println("Functional interface..");
    }
    static int getResult(){
        return 100;
    }
}

class Enter implements FunctionalInterfaceDemo,fun{

    @Override
    public void show() {

    }

    public void show2(){
        fun.super.show2();
    }

    static int getResult(){
        return 100;
    }

}
