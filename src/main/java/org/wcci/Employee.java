package org.wcci;

public abstract class Employee {

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

    public abstract String receivePay();

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", empId=" + empId +
//                ", salary=" + salary +
//                '}';
//    }
}






