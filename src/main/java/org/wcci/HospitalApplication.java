package org.wcci;

import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;

public class HospitalApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Create Hospital
        Hospital highStHospital = new Hospital();


//        Create Staff
        Doctor e1 = new Doctor("Vino", 1, 90000, "Corona Virus" );
        Nurse e2 = new Nurse("Miley", 2, 50000, 1);
        Receptionist e3 = new Receptionist("Amanda", 3, 45000, false);
        Janitor e4 = new Janitor("Travis Pettrey", 4, 40000, false);

        highStHospital.






        System.out.println("Hello and welcome to High St Hospital! We run a class 4 pandemic zombie trauma \n" +
                " center and have the best prepared staff in ohio.  Here they are:");


            System.out.println(getEmpId(e1));
            System.out.println(getEmpId(e2));
            System.out.println(getEmpId(e3));
            System.out.println(getEmpId(e4));


    }
    private static Doctor hireDoctor(Hospital highStHospital) {
        Doctor e1 = new Doctor("Vino", 1, 90000, "Corona Virus" );
        highStHospital.addEmployeeToList(e1);
        return e1;
    }
    private static Nurse hireNurse(Hospital highStHospital) {
        Nurse e2 = new Nurse("Miley", 2, 50000, 1);
        highStHospital.addEmployeeToList(e2);
        return e2;
    }
    private static Receptionist hireReceptionist(Hospital highStHospital) {
        Receptionist e3 = new Receptionist("Amanda", 3, 45000, false);
        highStHospital.addEmployeeToList(e3);
        return e3;
    }
    private static Janitor hireJanitor(Hospital highStHospital) {
        Janitor e4 = new Janitor("Travis Pettrey", 4, 40000, false);
        highStHospital.addEmployeeToList(e4);
        return e4;
    }






    private static Object getEmpId(Employee testEmployee) {
        return testEmployee;
    }
    private static Hospital createHospital() {
        return new Hospital();
    }






}
