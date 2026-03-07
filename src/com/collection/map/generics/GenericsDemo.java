package com.collection.map.generics;

import java.util.ArrayList;
import java.util.Collections;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(8);
        al.add(1);
        al.add(6);
        al.add("Excellant");
        al.add("need improvement");
        ArrayList storeInt = new ArrayList();
        ArrayList storeString = new ArrayList();

        for(Object rating :al){
            EmployeeAppraisal employeeAppraisal = new EmployeeAppraisal(rating, storeInt, storeString);
//            System.out.println(employeeAppraisal.getRating());
        }
    }
}
class EmployeeAppraisal<G, V>{
    G rating;

    public EmployeeAppraisal(G rating, ArrayList storeInt, ArrayList storeString){
        if(rating instanceof Integer){
            storeInt.add(rating);
            Collections.sort(storeInt);
            System.out.println("asc: " + storeInt);
//            System.out.println("Old rating Method. Provide ratings in Strings: Excellent,Good ect...");
        }else{
            storeString.add(rating);
            Collections.sort(storeString);
            System.out.println("asc: " + storeString);
//            getAscendingRating(al);
//            this.rating=rating;
        }
    }

    private void getAscendingRating(ArrayList al){
        for (Object obj : al){
            System.out.println("Asc ratings: " + obj);
        }
    }

    public G getRating(){
        return rating;
    }

}
