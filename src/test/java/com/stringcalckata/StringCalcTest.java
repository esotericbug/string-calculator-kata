package com.stringcalckata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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

}
