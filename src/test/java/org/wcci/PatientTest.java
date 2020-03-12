package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    Patient underTest;
    Doctor testDoctor;
    Nurse testNurse;

    @BeforeEach
    public void setUp() {
        underTest = new Patient("ken", 17, 4);
        testDoctor = new Doctor("waldo", 23, 400000, false, "othopedic");
        testNurse = new Nurse("beth", 10, 75000, true, 1);
    }

    @Test
    public void patientShouldHaveAName() {
        underTest.getName();
        assertEquals("ken", underTest.getName());
    }
    @Test
    public void patientShouldHaveABloodLevel() {
        underTest.getBloodLevel();
        assertEquals(17, underTest.getBloodLevel());
    }
    @Test
    public void patientShouldHaveAHealthLevel() {
        underTest.getHealthLevel();
        assertEquals(4, underTest.getHealthLevel());
    }
    @Test
    public void patientBloodLevelShouldDecreaseWhenTheyHaveBloodDrawn() {
        testNurse.drawBlood(underTest);
        assertEquals(12, underTest.getBloodLevel());
    }
    @Test
    public void patientHealthLevelShouldIncreaseWhenTheyReceiveCare() {
        testDoctor.provideCare(underTest);
        assertEquals(9, underTest.getHealthLevel());
    }
}