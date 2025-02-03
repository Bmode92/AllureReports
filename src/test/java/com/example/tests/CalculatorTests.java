package com.example.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    //https://allurereport.org/docs/install/

    //allure serve target/allure-results

    @Test
    public void testP1() {
        int result = 1 + 1;
        Assertions.assertEquals(2, result, "1 + 1 should be 2");
    }
}
