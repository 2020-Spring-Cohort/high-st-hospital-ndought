package org.wcci;

public class Nurse extends Employee {

    private int patientLoad;

    public int getPatientLoad() {
        return 2;
    }
    public Nurse(String name, int empId, int salary, int patientLoad) {
        super(name, empId, salary);
        this.patientLoad = patientLoad;
    }
    public void drawBlood(PatientTwo testPatient2)   {
        testPatient2.haveBloodDrawn(5);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "patientLoad=" + patientLoad +
                '}';
    }

}









