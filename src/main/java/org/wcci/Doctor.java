package org.wcci;

public class Doctor extends Employee {

    private String specialty;

    public Doctor(String name, int empId, int salary, boolean paid, String specialty) {
        super(name, empId, salary, paid);
        this.specialty = specialty;
    }
    public String getSpecialty() {
        return specialty;
    }

    public void drawBlood(Patient testPatient) {
        testPatient.haveBloodDrawn(2);
        testPatient.getHealthLevel();
    }


}
















    //    private String specialty;
//
//    public String getSpecialty() {
//        return specialty;
//    }
//
//    public Doctor(String name, int empId, int salary, String specialty) {
//        super(name, empId, salary);
//        this.specialty = specialty;
//    }
//
//    public void drawBlood(Patient testPatient) {
//        testPatient.haveBloodDrawn(5);
//    }
//}

