package org.wcci;

public class Employee {

    private String name;
    private int empId;
    private int salary;
    boolean isPaid;

    public Employee(String name, int empId, int salary, boolean isPaid) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.isPaid = isPaid;
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

    public boolean isPaid() {
        return isPaid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", isPaid=" + isPaid +
                '}';
    }
}






