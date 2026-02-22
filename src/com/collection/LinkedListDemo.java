package com.collection;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(1, 20);
        ll.add(2, 30);
        ll.add(20);
        ll.add(null);
        ll.add(null);
        ll.add("string1");
        System.out.println(ll);

        ArrayList<String> al = new ArrayList<String>();
        al.add("Rakesh");
        al.add("Roshan");

        LinkedList ll2 = new LinkedList(al);
        System.out.println(ll2);
        ll2.add("Hritik");
        System.out.println(ll2);
        ll2.addAll(ll);
        System.out.println("ll2: " + ll2);
        ll2.addAll(0, al);
        System.out.println("ll2: " + ll2);  //ll2: [Rakesh, Roshan, Rakesh, Roshan, Hritik, 10, 20, 30, 20, null, null, string1]

        ll2.addFirst('c');
        System.out.println("ll2: " + ll2);
        ll2.addLast(12.55);
        System.out.println("ll2: " + ll2);

        Object ll4 = ll2.clone();
        System.out.println("ll4: " + ll4);

        System.out.println(ll2.containsAll(al));

//        Iterator iterator = ll2.descendingIterator();
//        while(iterator.hasNext()){
//            System.out.println("desc: " + iterator.next());
//        }

//        iterator.next();
//        iterator.next();


//        ListIterator listIterator = ll2.listIterator(10);
//        listIterator.next();
//        listIterator.next();
//        while(listIterator.hasPrevious()){
//            System.out.println("listIterator: " + listIterator.previous());
//        }

        System.out.println(ll2.lastIndexOf("Roshan"));      //4
        ll2.offer(5);
        ll2.offerFirst(15.55);
        ll2.offerLast(45.55);
        System.out.println(ll2);

        System.out.println("peak: " + ll2.peek());
        System.out.println("pop: " + ll2.pop());
        System.out.println(ll2);

        ll2.remove("Rakesh");
        System.out.println("ll2: " + ll2);
        ll2.remove('c');                //a=97, b=98, c=99
        ll2.removeLastOccurrence(99.99);
        System.out.println("ll2: " + ll2);

    }
}
