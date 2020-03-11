package org.wcci;

public class Receptionist extends Employee {


    boolean isOnPhone;

    public Receptionist(String name, int empId, int salary, boolean isPaid, boolean isOnPhone) {
        super(name, empId, salary, isPaid);
        this.isOnPhone = isOnPhone;
    }

//    DO I NEED GETTERS FOR BOOLEANS? DO I NEED GETTERS FOR EVERYTHING OR JUST THE CLASSES SPECIAL VARIABLE???



}
//    DOES MY OVERRIDE INCLUDE EVERYTHING OR JUST THE CLASSES SPECIAL VARIABLE???


























//public class Receptionist extends Employee {
//
//    private boolean isUsingPhone;
//
//    public Receptionist(String name, int empId, int salary) {
//        super(name, empId, salary);
//        this.isUsingPhone = false;
//    }
//
//    public boolean getPhoneStatus() {
//        return isUsingPhone;
//    }
//
//    @Override
//    public boolean getPaid() {
//        return paid;
//    }
//
//    public boolean isOnPhone() {
//        return isUsingPhone;
//
//
//
//
//
//    }
//    public boolean paid() {
//        return false;
//    }
//}










