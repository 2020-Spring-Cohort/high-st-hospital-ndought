package org.wcci;

public class Doctor extends Employee {

    private String specialty;

    public Doctor(String name, int empId, int salary, String specialty) {
        super(name, empId, salary);
        this.specialty = specialty;
    }
    public String getSpecialty() {
        return specialty;
    }

    public void drawBlood(Patient testPatient) {
        testPatient.haveBloodDrawn(2);
    }
    public void provideCare(Patient testPatient) {
        testPatient.receiveCare(5);
    }

    @Override
    public void receivePay() {

    }

    @Override
    public String toString() {
        return  "Profession: (Doctor) Name= " + getName() + " || " + " Employee ID#= " + getEmpId() +
                 " || " + " Specialty= " + getSpecialty() + " || " + " Salary= " + getSalary();
    }
}


