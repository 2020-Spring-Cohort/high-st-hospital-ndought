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
    public String getName(String name) {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public int getEmpId(int empId) {
        return empId;
    }
    public int setEmpId(int empId) {
        return setEmpId(empId);
    }
    public int getSalary(int salary) {
        return salary;
    }

    public int setSalary(int salary) {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return null;
    }

    public int getEmpId() {
        return 0;
    }

    public int getSalary() {
        return 0;
    }
}



