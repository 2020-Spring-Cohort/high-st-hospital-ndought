package org.wcci;

public class Janitor extends Employee {

    boolean isSweeping;

    public Janitor(String name, int empId, int salary, boolean isSweeping) {
        super(name, empId, salary);
        this.isSweeping = isSweeping;
    }


    public boolean isSweeping() {
        return isSweeping;
    }

    @Override
    public String receivePay() {

        return "40,000";
    }

    @Override
    public String toString() {
        return  "Profession: (Janitor) Name= " + getName() + " || " + " Employee ID#= " + getEmpId() +
                " || " + " Currently Sweeping= " + isSweeping() + " || " + " Salary= " + getSalary();
    }
}


