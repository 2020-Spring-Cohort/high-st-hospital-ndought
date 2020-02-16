package org.wcci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getEmpId() {
    }

    @Test
    void setEmpId() {
    }

    @Test
    void getSalary() {
    }

    @Test
    void setSalary() {
    }

    @Test
    void testToString() {
    }
}

//package org.wcci;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//public class EmployeeTest {
//    private boolean paid;
//    private int empId;
//    private String name;
//
//    @Test
//    public void employeeShouldHaveAName() {
//        Employee testEmp = new Employee("ED", 002, 80000);
//        Employee underTest
//        assertEquals("ED");
//    }
//    @Test
//    public void employeeShouldHaveId() {
//        Employee testEmp = new Employee("ED", 002, 80000);
//        testEmp.setEmpId(002);
//        assertEquals(002);
//    }
//    @Test
//    public void employeeShouldGetPaid() {
//        Employee testEmp = new Employee("ED", 002, 80000);
//        testEmp.setPaid(true);
//        assertEquals(testEmp.getPaid());
//    }
//
//    private void assertEquals(boolean paid) {
//        this.paid = paid;
//    }
//    private void assertEquals(int empId) {
//        this.empId = empId;
//    }
//    private void assertEquals(String name) {
//        this.name = name;
//    }


//    @Test
//    public void  doctorsCanDrawBlood() {
//        Doctor testDoc = new Doctor("Bill", 123, 90000, "Brain");
//        Patient testPatient = new Patient("Bob");
//        testDoc.drawBlood(testPatient);
//        assertEquals(15, testPatient.getBloodLevel());

//    }
