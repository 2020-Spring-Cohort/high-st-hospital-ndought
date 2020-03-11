package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void testGetName() {
    }

    @Test
    public int getBloodLevel() {
        return 20;
    }

    @Test
    void haveBloodDrawn() {
    }
}