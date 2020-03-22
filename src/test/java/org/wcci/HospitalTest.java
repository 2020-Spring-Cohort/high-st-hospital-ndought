package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HospitalTest {

    private Hospital underTest;
    private Employee testEmployee;

    @BeforeEach
    void setUp() {
        underTest = new Hospital();
        testEmployee = new Employee("testEmployee", 3, 50000);
    }

    @Test
    public void canAddEmployeeToList() {
        underTest.addEmployee(testEmployee);
        assertEquals(1, underTest.size());
    }
    @Test
    public void canPayEmployees() {
        underTest.addEmployee(testEmployee);
        underTest.payEmployees();
        assertThat(testEmployee.receivePay());
    }
}


