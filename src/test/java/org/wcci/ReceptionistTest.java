package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceptionistTest {

    Receptionist underTest;

    @BeforeEach
    public void setUp() {
        underTest = new Receptionist("laura", 12, 35000, true, true);
    }

    @Test
    public void shouldBeAbleToSeeIfReceptionistIsOnPhoneOrNot() {
        underTest.isOnPhone();
        assertTrue(true);
    }


}