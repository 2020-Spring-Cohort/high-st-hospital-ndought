package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    Doctor underTest;
    Patient testPatient;


    @BeforeEach
    public void setup() {
        underTest = new Doctor("Ralph", 5, 90000, "Heart");
        testPatient = new Patient("billy", 20);
    }

    @Test
    public void doctorsCanDrawBlood() {
        underTest.drawBlood(testPatient);
        assertEquals(15, testPatient.getBloodLevel());
    }
    @Test
    public void doctorShouldHaveASalaryOf90k() {
        underTest.setSalary(90000);
        assertEquals(90000, underTest.getSalary());
    }
}





//   @Test
//    public void doctorsCanDrawBlood() {
//////        need doctor and patient to execute test....First line is the first half of interaction
//////     (class)(dummyDoc) (makesnewdummy)---fill in his variables)
//        Doctor testDoc = new Doctor("ff", 9, 76, "heart");
//////     second line is other half of interaction
//        Patient testPatient = new Patient("Bill", 20);
//////     in this line carry out the method or interaction
//        testDoc.drawBlood(testPatient);
//////  in this last line you get the outcome of the interaction (doctor drew the blood and now patients level decreased 5
//        assertEquals(15, testPatient.getBloodLevel());