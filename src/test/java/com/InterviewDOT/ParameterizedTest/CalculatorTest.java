package com.InterviewDOT.ParameterizedTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @DisplayName("should return 10 when the given inputs are 2 and 8")
    @Test
    void should_return_10_when_the_given_inputs_are_2_and_8() {
        assertEquals(10, calculator.sum(2L, 8L));
    }

    @DisplayName("should return 100 when the given inputs are 50 and 50")
    @Test
    void should_return_100_when_the_given_inputs_are_50_and_50() {
        assertEquals(100, calculator.sum(50L, 50L));
    }

    @DisplayName("should return 500 when the given inputs are -100 and 600")
    @Test
    void should_return_500_when_the_given_inputs_are_minus_100_and_600() {
        assertEquals(500, calculator.sum(-100L, 600L));
    }

    @DisplayName("should return 30 when the given inputs are 13 and 17")
    @Test
    void should_return_30_when_the_given_inputs_are_13_and_17() {
        assertEquals(30, calculator.sum(13L, 17L));
    }

    @DisplayName("should return -40 when the given inputs are -10 and -30")
    @Test
    void should_return_minus_40_when_the_given_inputs_are_minus_10_and_30() {
        assertEquals(-40, calculator.sum(-10L, -30L));
    }

    @DisplayName("should return ZERO when the given inputs are -10 and 10")
    @Test
    void should_return_ZERO_when_the_given_inputs_are_minus_10_and_10() {
        assertEquals(0, calculator.sum(-10L, 10L));
    }
}