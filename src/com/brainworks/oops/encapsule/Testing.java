package com.brainworks.oops.encapsule;

public class Testing {
    public static void main(String[] args) {

        //before encapsulation
//        employee1.address="Pune";             //setting of data
//        String str = employee1.address;       //getting the data
//        employee1.address="12
//

        //after encapsulation
//        employee1.setAddress("Pune adkjnsdh khasdiush iadsbsk                  ");
//        String str = employee1.getAddress();
//        System.out.println(str);

        Employee employee1 = new Employee();
        employee1.setEmpId(10);
        Employee employee2 = new Employee();
        employee2.setEmpId(20);

        System.out.println(employee1.getEmpId());
        System.out.println(employee2.getEmpId());
    }
}
