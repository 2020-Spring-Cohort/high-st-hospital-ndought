package org.wcci;

public class Receptionist extends Employee {

    boolean isOnPhone;

    public Receptionist(String name, int empId, int salary, boolean isOnPhone) {
        super(name, empId, salary);
        this.isOnPhone = isOnPhone;
    }


    public boolean isOnPhone() {
        return isOnPhone;
    }

    @Override
    public String receivePay() {

        return "45,000";
    }

    @Override
    public String toString() {
        return  "Profession: (Receptionist) Name= " + getName() + " || " + " Employee ID#= " + getEmpId() +
                " || " + " Phone Status= " + isOnPhone() + " || " + " Salary= " + getSalary();
    }
}











