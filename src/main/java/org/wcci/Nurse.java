package org.wcci;

public class Nurse extends Employee {

    public int patientLoad;

    public Nurse(String name, int empId, int salary, boolean isPaid, int patientLoad) {
        super(name, empId, salary, isPaid);
        this.patientLoad = patientLoad;
    }

    public int getPatientLoad() {
        return patientLoad;
    }

    public void drawBlood(Patient testPatient)   {
        testPatient.haveBloodDrawn(5);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "patientLoad=" + patientLoad +
                '}';
    }
}









