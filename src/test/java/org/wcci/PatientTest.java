package org.wcci;

import org.junit.jupiter.api.Test;

class PatientTest extends Patient {


    public PatientTest(String name, int bloodLevel) {
        super(name, bloodLevel);
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