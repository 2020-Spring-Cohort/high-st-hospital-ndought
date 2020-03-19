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
        Doctor e1 = new Doctor("Vino", 1, 90000, "Corona Virus");
        Nurse e2 = new Nurse("Miley", 2, 50000, 1);
        Receptionist e3 = new Receptionist("Amanda", 3, 45000, false);
        Janitor e4 = new Janitor("Travis Pettrey", 4, 40000, false);

        highStHospital.addEmployee(e1);
        highStHospital.addEmployee(e2);
        highStHospital.addEmployee(e3);
        highStHospital.addEmployee(e4);

//        Create Patients
        Patient p1 = new Patient("Jerry", 18, 7);
        Patient p2 = new Patient("Linda", 16, 4);

        highStHospital.addPatient(p1);
        highStHospital.addPatient(p2);

        e2.assignPatient(p1);
        e2.assignPatient(p2);

//      Turn Counter
        int loopCount = 0;

        boolean mainMenu = true;
        while (mainMenu) {

            loopCount +=1;
            impactOfLoopCount(highStHospital, loopCount);

            System.out.println("Hello and welcome to High St Hospital! We run a class 4 pandemic zombie trauma \n" +
                    " center and have the best prepared staff in ohio. Main Menu:");
            System.out.println("1. Staff Directory");
            System.out.println("2. Patient Directory");
            System.out.println("3. Assign Staff");
            System.out.println("4. Payroll");
            System.out.println("5. Exit");

            String mainMenuSelection = input.nextLine();

            switch (mainMenuSelection) {
                case "1":
                    System.out.println("\nStaff Directory");
                    System.out.println(highStHospital.getEmployeeList());
                    break;

                case "2":
                    System.out.println("\nPatient Status");
                    System.out.println("\nRooms Filled:" + highStHospital.getPatientList());
                    break;
                case "3":
                    boolean taskMenu = true;
                    while (taskMenu) {

                        loopCount +=1;
                        impactOfLoopCount(highStHospital, loopCount);

                        System.out.println("1. Administer Patient care");
                        System.out.println("2. Draw blood for COVID-19 testing and quarantine");
                        System.out.println("3. Return to Main Menu");

                        String taskMenuSelection = input.nextLine();

                        switch (taskMenuSelection) {
                            case "1":
                                System.out.println("\nWhich Patient would you like to test for Corona Virus?");
                                System.out.println(highStHospital.getPatientList());
                                System.out.println("\nEnter Patient Name:");
                                String patientName = input.nextLine();


                        }
                    }

            }
            break;
            case "1":

        }







            System.out.println(getEmpId(e1));
            System.out.println(getEmpId(e2));
            System.out.println(getEmpId(e3));
            System.out.println(getEmpId(e4));


    }

    private static void impactOfLoopCount(Hospital highStHospital, int loopCount) {
    }

//    private static Doctor hireDoctor(Hospital highStHospital) {
//        Doctor e1 = new Doctor("Vino", 1, 90000, "Corona Virus" );
//        highStHospital.addEmployeeToList(e1);
//        return e1;
//}
//    private static Nurse hireNurse(Hospital highStHospital) {
//        Nurse e2 = new Nurse("Miley", 2, 50000, 1);
//        highStHospital.addEmployeeToList(e2);
//        return e2;
//    }
//    private static Receptionist hireReceptionist(Hospital highStHospital) {
//        Receptionist e3 = new Receptionist("Amanda", 3, 45000, false);
//        highStHospital.addEmployeeToList(e3);
//        return e3;
//    }
//    private static Janitor hireJanitor(Hospital highStHospital) {
//        Janitor e4 = new Janitor("Travis Pettrey", 4, 40000, false);
//        highStHospital.addEmployeeToList(e4);
//        return e4;
//    }






    private static Object getEmpId(Employee testEmployee) {
        return testEmployee;
    }
    private static Hospital createHospital() {
        return new Hospital();
    }






}
