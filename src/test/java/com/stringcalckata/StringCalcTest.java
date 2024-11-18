package com.stringcalckata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalcTest {

    StringCalc stringCalc;

    @BeforeEach
    public void init() {
        stringCalc = new StringCalc();
    }

    @AfterEach
    public void destroy() {
        stringCalc = null;
    }

    @Test
    @DisplayName("Test Empty String")
    public void testEmptyString() {
        assertEquals(0, stringCalc.add(""));
    }

}
