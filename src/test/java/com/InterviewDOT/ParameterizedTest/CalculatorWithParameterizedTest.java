package com.InterviewDOT.ParameterizedTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorWithParameterizedTest {

    private Calculator calculator = new Calculator();

    @DisplayName("should return sum of given two numbers")
    @ParameterizedTest(name = "{index} => firstNumber=''{0}'' secondNumber=''{1}'' expectedSum=''{2}''")
    @CsvSource({
            "2 ,8 ,10",
            "50 ,50 ,100",
            "-100 ,600 ,500",
            "13 ,17 ,30",
            "-10 ,-30 ,-40",
            "-10 ,10 ,0",
    })
    void should_return_sum_of_two_numbers(Long firstNumber, Long secondNumber, Long expectedSum) {
        assertEquals(expectedSum, calculator.sum(firstNumber, secondNumber));
    }
}