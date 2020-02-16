package org.wcci;

public class Nurse extends Employee {

    private String specialty;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Nurse(String name, int empId, int salary, String specialty) {
        super(name, empId, salary);
        this.specialty = specialty;
    }

    public void drawBlood(Patient patient) {
        patient.haveBloodDrawn(-5);
    }
}






