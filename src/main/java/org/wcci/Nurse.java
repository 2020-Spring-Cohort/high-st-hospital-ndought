package org.wcci;

public class Nurse extends Employee {

    private int patientLoad;

    public int getPatientLoad() {
        return patientLoad;
    }

    public void setPatientLoad(int patientLoad) {
        this.patientLoad = patientLoad;
    }

    public Nurse(String name, int empId, int salary, int patientLoad) {
        super(name, empId, salary);
        this.patientLoad = patientLoad;
    }

    public void drawBlood(Patient patient) {
        patient.haveBloodDrawn(-5);
    }
}






