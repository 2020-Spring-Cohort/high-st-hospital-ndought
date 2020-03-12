package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    Doctor underTest;
    Patient testPatient;

    @BeforeEach
    public void setup() {
        underTest = new Doctor("Ralph", 5, 90000, true,"Heart");
        testPatient = new Patient("billy", 20, 4);
    }
    @Test
    public void doctorsShouldHaveASpecialty() {
        underTest.getSpecialty();
        assertEquals("Heart", underTest.getSpecialty());
    }
    @Test
    public void doctorsCanDrawBlood() {
        underTest.drawBlood(testPatient);
        assertEquals(18, testPatient.getBloodLevel());
    }
    @Test
    public void doctorsCanProvideCareToPatient() {
        underTest.provideCare(testPatient);
    }
    @Test
    public void whenDoctorProvidesCarePatientHealthLevelShouldIncrease() {
        underTest.provideCare(testPatient);
        assertEquals(9, testPatient.getHealthLevel());
    }

}




