package com.brainworks.oops.encapsule;

public class DemoThis {

    int rollNo;
//    DemoThis(){
//        this(10, "abc");                            //cosnturctor call using this
//        System.out.println("this is no-org constructo");
//    }
//
//    DemoThis(int i, String str){
//        System.out.println("This is parameterized constructor");
//    }



    void show(){
        this.showResult(this);
        System.out.println("this is show method");
    }

    void display(){
        show();                                //method call using this
        System.out.println("this is display method");
    }

    public static void main(String[] args) {
        DemoThis d = new DemoThis();
        DemoThis d1 = new DemoThis();
        DemoThis d2 = new DemoThis();

//        d.display();
        d.showResult(d2);
        System.out.println("roll no value===: " + d2.rollNo);              //20
//        d.helper();
    }

//    void helper(){
//        showResult(this);
//    }

    void showResult(DemoThis dt){
        dt.rollNo=20;
//        this.rollNo=dt.rollNo;
        System.out.println(dt.rollNo);
    }
}
