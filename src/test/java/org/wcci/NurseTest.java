package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NurseTest {

    Nurse underTest;
    PatientOne testPatient;
    PatientTwo testPatient2;

    @BeforeEach
    public void setUp() {
        underTest = new Nurse("linda", 3, 50000, 2);
        testPatient = new PatientOne("billy", 20, "lung cancer");
        testPatient2 = new PatientTwo("jon", 20, "leukemia");
    }

    @Test
    public void nursesShouldHaveAPatientLoad() {
        underTest.getPatientLoad();
        assertEquals(2, underTest.getPatientLoad());
    }
    @Test
    public void nursesShouldBePaid50k() {
        underTest.getSalary();
        assertEquals(50000, underTest.getSalary());
    }
    @Test
    public void nursesCanAlsoDrawBlood() {
        underTest.drawBlood(testPatient2);
        assertEquals(15, testPatient2.getBloodLevel());



    }




}