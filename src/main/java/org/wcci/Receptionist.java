package org.wcci;

public class Receptionist extends Employee {


    boolean isOnPhone;

    public Receptionist(String name, int empId, int salary, boolean isPaid, boolean isOnPhone) {
        super(name, empId, salary, isPaid);
        this.isOnPhone = isOnPhone;
    }
}











