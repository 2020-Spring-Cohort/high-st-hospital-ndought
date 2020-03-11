package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NurseTest {

    Nurse underTest;
    Patient testPatient;


    @BeforeEach
    public void setUp() {
        underTest = new Nurse("linda", 3, 50000, true, 1);
        testPatient = new Patient("billy", 20, 10);

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
        underTest.drawBlood(testPatient);
        assertEquals(15, testPatient.getBloodLevel());



    }




}