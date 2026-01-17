package com.brainworks.oops.encapsule;

public class DemoThis3 {
    int num;

    DemoThis3 returnObj(){
        return this;
    }

    public static void main(String[] args) {
        DemoThis3 d = new DemoThis3();
        d.num=20;
        DemoThis3 d2 = d.returnObj();
        System.out.println(d2.num);
        System.out.println(d==d2);
    }
}
