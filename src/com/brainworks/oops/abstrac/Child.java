package com.brainworks.oops.abstrac;

public class Child extends Parent{
    static String s;

    Child(){
        super(10);
    }

    @Override
    public void show(){
        System.out.println("Child class method");
    }

    public static void main(String[] args){
        Parent p = new Child();
//        Child c = (Child)new Parent(10);            //ClassCastException
        p.show();
//      s.concat("abc");                      //null pointer exception

        System.out.println(s);
    }
}
