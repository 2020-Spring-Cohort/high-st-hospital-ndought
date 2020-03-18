package org.wcci;

public class Nurse extends Employee {

    public int patientLoad;

    public Nurse(String name, int empId, int salary, int patientLoad) {
        super(name, empId, salary);
        this.patientLoad = patientLoad;
    }


    public int getPatientLoad() {
        return patientLoad;
    }
    public void provideCare(Patient testPatient) {
        testPatient.receiveCare(2);
    }

    public void drawBlood(Patient testPatient)   {
        testPatient.haveBloodDrawn(5);
    }

    @Override
    public void receivePay() {

    }

    @Override
    public String toString() {
        return  "Profession: (Nurse) Name= " + getName() + " || " + " Employee ID#= " + getEmpId() +
                " || " + " Patient Load= " + getPatientLoad() + " || " + " Salary= " + getSalary();
    }
}









