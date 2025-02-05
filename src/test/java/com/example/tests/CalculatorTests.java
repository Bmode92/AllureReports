package com.example.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("UI")
@Feature("Calculator")
public class CalculatorTests extends BaseTest {

    //https://allurereport.org/docs/install/
    //mvn clean test > run test
    //allure serve target/allure-results > generate result from test run
    //glpat-z1EEA1JRWqXeyb95xrT8
    //https://gitlab.com/StanislavPodlipenskyi/demoalluregitlab


    @Test
    @DisplayName("Check: 1 + 1 = 2")
    @Story("User set positive values")
    public void testP1() {
        var result = calculateSum(1, 1);
        step("Verify that the result equals 2: " + result);
        assertEquals(2, result, "1 + 1 should be 2");
    }

    @Step("Calculate sum: {a} + {b}")
    public int calculateSum(int a, int b) {
        return a + b;
    }
}
