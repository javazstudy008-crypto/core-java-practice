package com.collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
//        int[] arr = {88,15,20,30,45};
//        arr[2]=22;
//        System.out.println(arr[2]);
        List list = new ArrayList(10);
        list.add(10);
        list.add("Chetan");
        list.add(2, 'c');
        list.add(3, "Rohan");
        System.out.println(list);
        list.add(3, 20);
        System.out.println(list);
        list.set(3, 44);
        System.out.println(list);           //[10, Chetan, c, 44, Rohan,55]
        int index = list.indexOf('c');
        System.out.println(index);
        if(list.contains(44)){
            System.out.println(list.indexOf(44));
        }
        System.out.println(list.add(55));       //[10, Chetan, c, 44, Rohan,55]
        System.out.println(list.remove("Chetan"));      //[10, c, 44, Rohan,55]
//        list.remove(10);            //IndexOutOfBoundsException
        list.remove(0);        //[ c, 44, Rohan,55]
        System.out.println(list);

        list.remove(Integer.valueOf(55));
        System.out.println("list: " + list);

        List list2 = new ArrayList(list);
        System.out.println("list2: " + list2);
        list2.add("Akshay");
        list2.add(20);
        System.out.println("list2: " + list2);      //[c, 44, Rohan, Akshay, 20]

        List list3 = new ArrayList();
        list3.add("list3");
        list3.add(3);

        list2.add(list3);
        System.out.println("list2: " + list2);      //list2: [c, 44, Rohan, Akshay, 20, [list3, 3]]

        List list4 = new ArrayList();
        list4.add("list4");
        list4.add(4);

        list2.addAll(list4);
        System.out.println(list2);      //[c, 44, Rohan, Akshay, 20, [list3, 3], list4, 4]

        list2.remove(list3);
        System.out.println(list2);      //[c, 44, Rohan, Akshay, 20, list4, 4]

        list2.removeAll(list4);
        System.out.println(list2);      //[c, 44, Rohan, Akshay, 20]

        list2.add("Rohan");
        System.out.println("list2: " + list2);
        list2.remove("Rohan");
        System.out.println("list2: " + list2);

        Iterator iterator = list2.iterator();

        while (iterator.hasNext()){
            System.out.println("list2 elements: " + iterator.next());
        }

        list2.clear();
        System.out.println("List2: " + list2);

        List<String> strList = new ArrayList<>();
        strList.add("Chetan");
//        strList.add(15);        //not allowed because of generics.
        strList.add(null);
        strList.add(null);
        strList.add("Karan");
        System.out.println(strList);

//        Client c1 = new Client();
//        c1.setClientId(100);
//        c1.setClientName("Chetan");
//        c1.setClientRequirment("req1");
//
//        Client c2 = new Client();
//        c2.setClientId(101);
//        c2.setClientName("Parth");
//        c2.setClientRequirment("req2");
//
//        int[] arr = {88,15,20,30,45};
//        Arrays.sort(arr);
//
//        List l = new ArrayList();
//
//        int i = 5;              //won't work with primitive data-type
//        Integer i1 = 10;
//        l.add(i1);
//        l.add(i);              //Autoboxing: converting primitive datatype to Wrapper class
//
//        Map map = new HashMap();
//        map.put(c1.getClientId(), c1);
//        map.put(101, c2);
    }
}
