package com.brainworks.oops.encapsule;

public class Employee {
    private int empId;
    private String name;
    private String address;

    public void setEmpId(int empId){
        if(empId>0){
            this.empId=empId;
        }
    }
    public int getEmpId(){
        return this.empId;
    }

    public void setAddress(String add){
        if(add.trim().length()<50){
            address=add.trim();
        } else{
            address=add.trim().substring(0, 50);
        }
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name){
        if(name.length()<=10){
            this.name=name;
        }
        else{
            name = name.substring(0, 10);
            this.name=name;
        }
    }

    public String getName(){
        return name;
    }


}
