package com.packages;

import com.brainworks.oops.Animal;

public class Student {
    public int rollNo;
    public String name;
    int parentContact;
    double marks;
    public String collegeName;
    int noOfTreePlanted;

    private Student(int rollNo, String name){
        this.rollNo= rollNo;
        this.name = name;
    }

    Student(double marks, String collegeName){
        this.rollNo= rollNo;
        this.name = name;
    }

//    public void studentDetails(){
//        System.out.println();
//        System.out.println("name: " + this.name);
//    }

}
