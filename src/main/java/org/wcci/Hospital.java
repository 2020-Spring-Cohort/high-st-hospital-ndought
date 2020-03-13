package org.wcci;

import java.util.HashMap;

public class Hospital {

    private HashMap<Integer, Employee> employeeList = new HashMap<>();

    public HashMap<Integer, Employee> getEmployeeList() {
        return employeeList;
    }
    public void addEmployeeToList(Employee testEmployee) {
        employeeList.put(testEmployee.getEmpId(), testEmployee);
    }
    public int size() {
        return employeeList.size();
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "employeeList=" + employeeList +
                '}';
    }

    public void payEmployees() {
        for (Employee employeeToBePaid : employeeList.values()) {
            employeeToBePaid.isPaid();
        }
    }
}
