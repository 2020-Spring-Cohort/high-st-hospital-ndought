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

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }

    public void setPaid(boolean b) {
        return;
    }
}




//    private String name;
//    private int empId;
//    private int salary;
//    private boolean paid;
//
//
//    public Employee(String name, int empId, int salary) {
//        this.name = name;
//        this.empId = empId;
//        this.salary = salary;
//    }
//    public String getName(String name) {
//        return name;
//    }
//    public String setName(String name) {
//        this.name = name;
//        return name;
//    }
//    public int getEmpId(int empId) {
//        return empId;
//    }
//    public int setEmpId(int empId) {
//        return setEmpId(empId);
//    }
//    public int getSalary(int salary) {
//        return salary;
//    }
//
//    public int setSalary(int salary) {
//        return salary;
//    }
//
//    private boolean getPaid() {
//        return paid;
//    }
//
//    private void setPaid(boolean paid){
//        this.paid = paid;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", empId=" + empId +
//                ", salary=" + salary +
//                '}';
//    }
//
//    public String getName() {
//        return null;
//    }
//
//    public int getEmpId() {
//        return 0;
//    }
//
//    public int getSalary() {
//        return 0;
//    }
//
//
//}



