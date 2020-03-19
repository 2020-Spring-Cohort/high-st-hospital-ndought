package org.wcci;

import java.util.ArrayList;

public class Nurse extends Employee {



    public Nurse(String name, int empId, int salary, int patientLoad) {
        super(name, empId, salary);

    }
//    Collection of Patients
    private ArrayList<Object> patientLoad = new ArrayList<>();

    public ArrayList<Object> getPatientLoad() {
        return patientLoad;
    }
    public int getPatientLoadCount() {
      return patientLoad.size();
  }
  public void assignPatient(Object patient) {
        patientLoad.add(patient);
  }
    public void provideCare(Patient testPatient) {
        testPatient.receiveCare(2);
    }

    public void drawBlood(Patient testPatient)   {
        testPatient.haveBloodDrawn(5);
    }



    @Override
    public String receivePay() {
        return "50,000";
    }

    @Override
    public String toString() {
        return  "Profession: (Nurse) Name= " + getName() + " || " + " Employee ID#= " + getEmpId() +
                " || " + " Patient Load= " + getPatientLoad() + " || " + " Salary= " + getSalary();
    }
}









