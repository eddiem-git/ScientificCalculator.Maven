package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {

    @Before
    public void setUp() throws Exception {
        Subtraction subtractionTest = new Subtraction();
    }
    @Test
    public void subtractionTest() {
        // given
        Subtraction value = new Subtraction();
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = inputValue1 - inputValue2;

        // when
        double actual = value.subtract(inputValue1, inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void subtractionTest1() {
        // given
        Subtraction value = new Subtraction();
        double inputValue1 = 3;
        double inputValue2 = 2;
        double expected = inputValue1 - inputValue2;

        // when
        double actual = value.subtract(inputValue1, inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }
}