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

    @Test
    @DisplayName("Test Numbers")
    public void testAddNumbers() {
        assertEquals(3, stringCalc.add("1,2"));
    }

    @Test
    @DisplayName("Test Numbers with Negatives")
    public void testNegativeNumber() {
        try {
            stringCalc.add("-1,2");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "negative numbers not allowed -> -1");
        }
        try {
            stringCalc.add("1,-2,3,-4");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "negative numbers not allowed -> -2,-4");
        }
    }

    @Test
    @DisplayName("Test Additional Delimiters")
    public void testOtherDelimiter() {
        assertEquals(3, stringCalc.add("//;\n1;2"));
    }
}
