package org.wcci;

import java.util.HashMap;

public class Hospital {

    private HashMap<String, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee emp){
        employeeMap.put(emp.getName(), emp);
    }

    private HashMap<String, Patient> patientMap = new HashMap<>();

    public void addPatient(Patient pat) {
        patientMap.put(pat.getName(), pat);
    }

    public void payAllEmployees(){
        for(Employee emp: employeeMap.values()){
            emp.setPaid(true);
        }
    }

}
