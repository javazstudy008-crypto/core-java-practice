package com.collection;

import java.util.*;

public class Employee implements Comparable<Employee>{
    private int employeeId;
    private String employeeName;
    private int salary;

    public Employee(int employeeId, String employeeName, int salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.employeeId-o.employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.employeeId==e.employeeId;
    }

    @Override
    public int hashCode() {
        return employeeId;
    }


    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap();
        Employee e1 = new Employee(3221, "Rakesh", 125);
        Employee e2 = new Employee(3222, "Rohan", 128);
        map.put(e1.getEmployeeId(), e1);
        map.put(e2.getEmployeeId(), e2);

        List<String> employeeNames = new ArrayList<>();
        Set<Integer> set = map.keySet();

        for(Integer e : set){
            Employee emp = map.get(e);
            employeeNames.add(emp.getEmployeeName());
        }
    }
}
