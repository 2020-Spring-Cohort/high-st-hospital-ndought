package org.wcci;

import java.util.Scanner;

public class HospitalApplication {
    private static Scanner input;
    private static Object onPhone;

    public static void main(String[] args) {

        Doctor e1 = new Doctor("Vino", 007, 90000, "Heart");
        e1.setName("Vino");
        Nurse e2 = new Nurse("Amanda", 002, 50000, 2);
        e2.setName("Amanda");
        Receptionist e3 = new Receptionist("Miley", 003, 45000, true);
        e3.setName("Miley");
        Janitor e4 = new Janitor("Noah", 004, 40000, true);
        e4.setName("Noah");
        PatientOne p1 = new PatientOne("Bob", 20, "Heart Disease");
        p1.setName("Bob");
        PatientTwo p2 = new PatientTwo("Sally", 17, "Blood Clot");
        p2.setName("Sally");

        Hospital hospital = new Hospital();
        hospital.addEmployee(e1);
        hospital.addEmployee(e2);
        hospital.addEmployee(e3);
        hospital.addEmployee(e4);
        hospital.addPatient(p1);
        hospital.addPatient(p2);


        System.out.println("Hello and welcome to High St Hospital!!");
        System.out.println("Here is a list of our Employees: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        System.out.println("Here is a list of our Patients: ");
        System.out.println(p1);
        System.out.println(p2);


    }

}
