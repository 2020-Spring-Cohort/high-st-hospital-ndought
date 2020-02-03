package org.wcci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    public void employeeShouldHaveAName() {
        Employee underTest = new Employee("Vino", 007, 90000);
        String result = underTest.getName();
        assertEquals("Vino",result);
    }
    @Test
    public void employeeShouldHaveId() {
        Employee underTest = new Employee("Vino", 007, 90000);
        int result = underTest.getEmpId();
        assertEquals(007,result);
    }
    @Test
    public void employeeShouldHaveSalary() {
        Employee underTest = new Employee("Vino", 007, 90000);
        int result = underTest.getSalary();
        assertEquals(90000, result);
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
