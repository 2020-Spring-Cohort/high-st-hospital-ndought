package org.wcci;

import java.util.Scanner;

public class HospitalApplication {
    private static Scanner input;
    private static Object onPhone;

    public static void main(String[] args) {

        Doctor e1 = new Doctor("Vino", 007, 90000, "Heart");
        e1.setName("Vino");
        Nurse e2 = new Nurse("Amanda", 002, 50000);
        e2.setName("Amanda");
        Receptionist e3 = new Receptionist("Miley", 003, 45000);
        e3.setName("Miley");
        Janitor e4 = new Janitor("Noah", 004, 40000);
        e4.setName("Noah");
        Patient patient = new Patient("Bob");

        Hospital hospital = new Hospital();
        hospital.addEmployee(e1);


        System.out.println("Hello and welcome to High St Hospital!!");
        System.out.println("Here is a list of our Employees: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }
}
