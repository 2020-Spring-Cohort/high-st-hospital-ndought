package org.wcci;

import java.io.*;
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
        Nurse e2 = new Nurse("Miley", 2, 50000, 2);
        Receptionist e3 = new Receptionist("Amanda", 3, 45000, false);
        Janitor e4 = new Janitor("Travis Pettrey", 4, 40000, false);

        highStHospital.addEmployee(e1);
        highStHospital.addEmployee(e2);
        highStHospital.addEmployee(e3);
        highStHospital.addEmployee(e4);



//        Create Patients
        Patient p1 = new Patient("Jerry", 18, 3);
        Patient p2 = new Patient("Linda", 16, 4);

        highStHospital.addPatient(p1);
        highStHospital.addPatient(p2);

        p1.receiveCare(4);
        p2.receiveCare(6);

//        e2.assignPatient(p1);
//        e2.assignPatient(p2);

//      Turn Counter
        int loopCount = 0;

        boolean mainMenu = true;
        while (mainMenu) {

            loopCount +=1;
            impactOfLoopCount(highStHospital, loopCount);

            System.out.println("\nHello and welcome to High St Hospital! We run a class 4 pandemic zombie trauma \n" +
                    " center and have the best prepared staff in ohio. Main Menu:\n");
            System.out.println("1. Staff Directory\n");
            System.out.println("2. Patient Directory\n");
            System.out.println("3. Administer Care\n");
            System.out.println("4. Payroll\n");
            System.out.println("5. Exit");

            String mainMenuSelection = input.nextLine();

            switch (mainMenuSelection) {
                case "1":
                    System.out.println("\n**Staff Directory**\n");
                    System.out.println(getEmpId(e1));
                    System.out.println(getEmpId(e2));
                    System.out.println(getEmpId(e3));
                    System.out.println(getEmpId(e4));
                    System.out.println("\n");
                    break;

                case "2":
                    System.out.println("\n**Patient Status**");
                    System.out.println("\nRooms Filled: \n" + highStHospital.pagePatient("Jerry"));
                    System.out.println(highStHospital.pagePatient("Linda"));
                    break;
                case "3":
                    boolean taskMenu = true;
                    while (taskMenu) {

                        loopCount += 1;
                        impactOfLoopCount(highStHospital, loopCount);

                        System.out.println("\n**Administer Patient care**");
                        System.out.println("\n1. Give basic care");
                        System.out.println("\n2. Draw blood for COVID-19 testing and quarantine\n");


                        System.out.println("3. Return to Main Menu");

                        String taskMenuSelection = input.nextLine();

                        switch (taskMenuSelection) {
                            case "1":
                                System.out.println("\nWhich Patient would you like to care for?");
                                System.out.println(highStHospital.pagePatient("Jerry"));
                                System.out.println(highStHospital.pagePatient("Linda"));
                                System.out.println("\nEnter Patient Name:");
                                String patientName = input.nextLine();
                                System.out.println(p1.getHealthLevel());

                            case "2":
                                System.out.println("\nWhich Patient would you like to test for Corona Virus?");
                                System.out.println(highStHospital.pagePatient("Jerry"));
                                System.out.println(highStHospital.pagePatient("Linda"));
                                System.out.println("\nEnter Patient Name:");
                                patientName = input.nextLine();



                        }
//                        break;


                    }
//                    break;





                case "6":
                    System.out.println("\nHospital Payroll");
                    for (Employee employee : highStHospital.getEmployeeList()) {
                        System.out.println("Employee " + employee.getEmpId() + " (" + employee.getName() + "):\t"
                                + employee.getSalary() + " annually.");
                    }


            }
//            break;

        }











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
