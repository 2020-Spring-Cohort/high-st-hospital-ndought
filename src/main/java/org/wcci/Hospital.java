package org.wcci;

import java.util.Collection;
import java.util.HashMap;

public class Hospital {

    private HashMap<Integer, Employee> employeeList = new HashMap<>();
    private HashMap<String, Patient> patientList = new HashMap<>();

    public void addEmployee(Employee newEmployee) {
        employeeList.put(newEmployee.getEmpId(), newEmployee);
    }
    public void addPatient(Patient newPatient) {
        patientList.put(newPatient.getName(), newPatient);
    }
    public Employee pageEmployee(Integer empId) {
        return employeeList.get(empId);
    }
    public Patient pagePatient(String patientName) {
        return patientList.get(patientName);
    }
    public Collection<Employee> getEmployeeList() {
        return employeeList.values();
    }
    public Collection<Patient> getPatientList() {
        return patientList.values();
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "employeeList=" + employeeList +
                '}';
    }

    public void payEmployees() {
        for (Employee employeeToBePaid : employeeList.values()) {
            employeeToBePaid.receivePay();
        }
    }
}
