package com.mutil.threading.outerr;

public class Test {

    public static void main(String[] args) {
        //static class calling
        OuterClassDemo.StaticNestedClassDemo staticDemo = new OuterClassDemo.StaticNestedClassDemo();
        System.out.println(staticDemo.i);

        //inner class calling
//        OuterClassDemo.InnerClassDemo inner = new OuterClassDemo.InnerClassDemo();
        OuterClassDemo outer = new OuterClassDemo();
        OuterClassDemo.InnerClassDemo obj1 = outer.new InnerClassDemo();
    }

}
