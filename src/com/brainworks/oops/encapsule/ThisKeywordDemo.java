package com.brainworks.oops.encapsule;

public class ThisKeywordDemo {
    int no=10;

    void show(int no){
        System.out.println(no);                 //30
        System.out.println(this.no);            //10
    }

    public static void main(String[] args) {
        ThisKeywordDemo demo = new ThisKeywordDemo();
        demo.show(20);

        ThisKeywordDemo demo2 = new ThisKeywordDemo();
        demo2.show(50);
    }
}
