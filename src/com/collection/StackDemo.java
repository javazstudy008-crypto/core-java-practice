package com.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.add(15);
        st.add(10);
        st.add(20);
        st.add(25);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        st.push(88);
        System.out.println(st);
        System.out.println(st.capacity());
    }
}
