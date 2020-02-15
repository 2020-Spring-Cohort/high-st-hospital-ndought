package org.wcci;

public class Receptionist extends Employee {

    private boolean isUsingPhone;

    public Receptionist(String name, int empId, int salary) {
        super(name, empId, salary);
        this.isUsingPhone = false;
    }

    public boolean getPhoneStatus() {
        return isUsingPhone;
    }

    @Override
    public boolean getPaid() {
        return paid;
    }

    public boolean isOnPhone() {
        return isUsingPhone;





    }
    public boolean paid() {
        return false;
    }
}










