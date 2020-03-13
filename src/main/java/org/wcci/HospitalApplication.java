package org.wcci;

import java.util.HashMap;
import java.util.Scanner;

public class HospitalApplication {
    public static void main(String[] args) {

    Hospital hospital = new Hospital();


        Employee e1 = new Doctor("Vino", 1, 90000, true, "Corona Virus" );
        Employee e2 = new Nurse("Miley", 2, 50000, true, 1);
        Employee e3 = new Receptionist("Amanda", 3, 45000, false, true);
        Employee e4 = new Janitor("Travis Pettrey", 4, 40000, false, true);

        HashMap employeeList = new HashMap();

        employeeList.put(e1, new Doctor("Vino", 1, 90000, true, "Corona Virus"));
        employeeList.put(e2, new Nurse("Miley", 2, 50000, true, 1));
        employeeList.put(e3, new Receptionist("Amanda", 3, 45000, false, true));
        employeeList.put(e4, new Janitor("Travis Pettrey", 4, 40000, false, true));



        System.out.println("Hello and welcome to High St Hospital! We run a class 4 pandemic zombie trauma \n" +
                " center and have the best prepared staff in ohio.  Here they are:");
        System.out.println(employeeList.values());


    }



}
