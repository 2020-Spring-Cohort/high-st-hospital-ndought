package org.wcci;

public class Employee {

    private String name;
    private int empId;
    private int salary;


    public Employee(String name, int empId, int salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    public String receivePay() {
        return null;
    }


}






