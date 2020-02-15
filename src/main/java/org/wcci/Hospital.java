package org.wcci;

import java.util.HashMap;

public class Hospital {

    private HashMap<String, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee emp){
        employeeMap.put(emp.getName(), emp);
    }

    public void payAllEmployees(){
        for(Employee emp: employeeMap.values()){
            emp.setPaid(true);
        }
    }

}
