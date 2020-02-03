package org.wcci;

import java.util.Scanner;

public class HospitalApplication {
    private static Scanner input;

    public static void main(String[] args) {

        Employee e1 = new Doctor("Vino", 007, 90000);
        e1.setName("Vino");
        Employee e2 = new Nurse("Amanda", 002, 50000);
        e2.setName("Amanda");
        Employee e3 = new Receptionist("Miley", 003, 45000);
        e3.setName("Miley");
        Employee e4 = new Janitor("Noah", 004, 40000);
        e4.setName("Noah");


        System.out.println("Hello and welcome to High St Hospital!!");
        System.out.println("Here is a list of our Employees: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }
}
