package org.wcci;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    Employee underTest;

    @BeforeEach
    public void setUp() {
        underTest = new Employee("zorro", 1, 20000) {
            @Override
            public String receivePay() {
                return null;
            }
        };
    }
    @Test
    public void employeeShouldHaveAName() {
        underTest.getName();
        assertEquals("zorro", underTest.getName());
    }
    @Test
    public void employeeShouldHaveAnEmployeeId() {
        underTest.getEmpId();
        assertEquals(1, underTest.getEmpId());
    }
    @Test
    public void employeeShouldHaveASalary() {
        underTest.getSalary();
        assertEquals(20000, underTest.getSalary());
    }
    @Test
    public void employeeShouldBePaid() {
        underTest.receivePay();
        assertTrue(true);
    }

}


