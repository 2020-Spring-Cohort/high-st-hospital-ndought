package org.wcci;


import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;

import javax.swing.*;
import java.util.Scanner;

public class HospitalApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      Create Hospital
      Hospital highStHospital = new Hospital();

      Doctor e1 = new Doctor("Vino", 1, 90000, "Corona Virus");
      Nurse e2 = new Nurse("Miley", 2, 50000, 2);
      Receptionist e3 = new Receptionist("Amanda", 3, 45000, false);
      Janitor e4 = new Janitor("Travis Pettrey", 4, 40000, false);

      highStHospital.addEmployee(e1);
      highStHospital.addEmployee(e2);
      highStHospital.addEmployee(e3);
      highStHospital.addEmployee(e4);

      Patient p1 = new Patient("Jerry", 18, 3);
      Patient p2 = new Patient("Linda", 16, 4);

      highStHospital.addPatient(p1);
      highStHospital.addPatient(p2);

      p1.receiveCare(4);
      p2.receiveCare(6);

//      e2.assignPatient(p1);
//      e2.assignPatient(p2);

      int loopCount = 0;

      boolean mainMenu = true;
        while (mainMenu) {

            loopCount += 1;
            impactOfLoopCount(highStHospital, loopCount);

            System.out.println("\nHello and welcome to High St Hospital! We run a class 4 pandemic zombie trauma \n" +
                    " center and have the best prepared staff in ohio. Main Menu:\n");
            System.out.println("1. Staff Directory\n");
            System.out.println("2. Patient Directory\n");
            System.out.println("3. Administer Care\n");
            System.out.println("4. Exit");

            String mainMenuSelection = input.nextLine();

            switch (mainMenuSelection) {
                case "1":
                    System.out.println("\n**Staff Directory**\n");
                    System.out.println(getEmpId(e1));
                    System.out.println(getEmpId(e2));
                    System.out.println(getEmpId(e3));
                    System.out.println(getEmpId(e4));
                    break;
                case "2":
                    System.out.println("\n**Patient Status**");
                    System.out.println("\nRooms Filled: \n" + highStHospital.pagePatient("Jerry"));
                    System.out.println(highStHospital.pagePatient("Linda"));
                    break;
                case "3":
                    boolean taskMenu = true || false;
                    while (taskMenu = true) {

                        loopCount += 1;
                        impactOfLoopCount(highStHospital, loopCount);

                        System.out.println("\n**Administer Patient care**");
                        System.out.println("\n1. Give basic care");
                        System.out.println("\n2. Draw blood for COVID-19 testing and quarantine\n");
                        System.out.println("3. Return to Main Menu");

                        String taskMenuSelection = input.nextLine();

                        switch (taskMenuSelection) {
                            case "1":
                                System.out.println("\nIf you would like to administer basic care to Jerry please enter his name below");
                                System.out.println(highStHospital.pagePatient("Jerry"));
                                System.out.println("\nEnter Patient Name:");
                                String patientName = input.nextLine();
                                System.out.println("Jerry's new Health Level: " + p1.receiveCare(+5));
                                break;
                            case "2":
                                System.out.println("\nIf you would like to Draw blood from Linda to test for COVID-19 please enter her name below");
                                System.out.println(highStHospital.pagePatient("Linda"));
                                System.out.println("\nEnter Patient Name:");
                                patientName = input.nextLine();
                                System.out.println("Linda has COVID-19 :( Linda is now dead. Linda's Health level: " + p2.haveBloodDrawn(-16));
                                System.out.println("Byeeeeee Linda");
                                break;
                            case "3":
//                                ***NEED THIS TO RETURN USER BACK TO MAIN MENU****

                        }
                    }
                case "4":
                    System.out.println("Thank you for visiting our hospital. Have a nice day and stay safe during this pandemic!!");
                    mainMenu = false;
                    break;
            }
        }

    }
    private static Employee getEmpId(Employee testEmployee) {
        return testEmployee;
    }
    private static Hospital createHospital() {
        return new Hospital();
    }
    private static void impactOfLoopCount(Hospital highStHospital, int loopCount) {
    }
}







