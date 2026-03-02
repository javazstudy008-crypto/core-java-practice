package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add(10);
        queue.offer(8);
        queue.add(12);
        queue.offer(18);
        queue.add(100);
        queue.offer(80);
        queue.add(1);
        queue.offer(8);
        queue.add(1000);
        queue.offer(800);
        System.out.println("queue: " + queue);
        queue.remove(100);
//        System.out.println(queue);
//
//        System.out.println(queue.remove(55));
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.clear();
////        System.out.println(queue.remove());     //NoSuchElementException
//        System.out.println(queue.poll());
//        queue.offer(10);
//        queue.add(8);
//        queue.add(12);
//        queue.offer(18);
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
//        queue.clear();
////        System.out.println(queue.element());        //NoSuchElementException
//        System.out.println(queue.peek());               //null
    }
}
