package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JanitorTest  {

    Janitor underTest;

    @BeforeEach
    public void setUp() {
        underTest = new Janitor("lenny", 24, 20000, true);
    }

    @Test
    public void shouldBeAbleToSeeIfJanitorIsSweeping() {
        underTest.isSweeping();
        assertFalse(false);
    }


}