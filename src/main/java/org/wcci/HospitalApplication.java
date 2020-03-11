package org.wcci;

import java.util.Scanner;

public class HospitalApplication {
    private static Scanner input;
    private static Object onPhone;

    public static void main(String[] args) {

        Doctor e1 = new Doctor("Vino", 007, 90000, true, "Heart");
        e1.getName();
        Nurse e2 = new Nurse("Amanda", 002, 50000,  true, 1);
        e2.getName();
        Receptionist e3 = new Receptionist("Miley", 003, 45000, false, true);
        e3.getName();
        Janitor e4 = new Janitor("Noah", 004, 40000, false, false);
        e4.getName();
        Patient p1 = new Patient("Bob", 20, 10);
        p1.getName();
        Patient p2 = new Patient("Sally", 17, 10);
        p2.getName();

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
