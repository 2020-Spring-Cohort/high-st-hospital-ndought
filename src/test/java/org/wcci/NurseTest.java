package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NurseTest {

    Nurse underTest;
    Patient testPatient;

    @BeforeEach
    public void setUp() {
        underTest = new Nurse("linda", 3, 50000,  1);
        testPatient = new Patient("billy", 20, 6);
    }
    @Test
    public void nursesShouldHaveAPatientLoad() {
        underTest.getPatientLoad();
        assertEquals(1, underTest.getPatientLoad());
    }
    @Test
    public void nursesCanDrawBlood() {
        underTest.drawBlood(testPatient);
        assertEquals(20, testPatient.getBloodLevel());
    }
    @Test
    public void nursesCanProvideCare() {
        underTest.provideCare(testPatient);
        assertEquals(6, testPatient.getHealthLevel());
    }




}