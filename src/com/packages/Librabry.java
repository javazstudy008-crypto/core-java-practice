package com.packages;

import com.brainworks.oops.Lecture11_Practice;

public class Librabry {
    int bookNo=123;
    String bookName;
    static Student s1 = new Student(85.2, "Kunal");

    public static void main(String[] args) {
        Librabry lb = new Librabry();
                //de
        System.out.println("Roll no of Student: " + s1.rollNo);
        System.out.println("Name of Student: " + s1.name);
        s1.rollNo=10;
        s1.name="Kunal";
        Student s2 = new Student(11, "Saurabh");
        s2.rollNo=11;
        s2.name="Saurabh";
        lb.borrowedBooks(s2);
    }
    void borrowedBooks(Student std){
        System.out.println("bookno: " + bookNo + " issue to: " + std.rollNo);
    }
}
