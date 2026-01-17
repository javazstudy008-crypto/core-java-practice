package com.brainworks.oops.encapsule;

public class DemoThis2 {

    DemoThis2(){
        System.out.println("inside no-org constructor");
    }

    DemoThis2(DemoThis2 d){
        System.out.println("inside arg constructor");
    }

    void utility(){
        DemoThis2 dt = new DemoThis2(this);
//        show(this);
    }


    int rollNo;

    public static void main(String[] args) {
        DemoThis2 dt = new DemoThis2();
        dt.utility();
//        DemoThis2 dt2 = new DemoThis2();
//        dt.show(dt2);
//        dt.show(dt);

//        dt2.utility();
//        System.out.println("===1===: " + dt.rollNo);
//        System.out.println("===2===: "  + dt2.rollNo);
    }
    void show(DemoThis2 demoThis2){
        demoThis2.rollNo=20;
        System.out.println("roll no is: " + this.rollNo);
    }
}
