package com.b2b.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PositiveNumberNegativeNumberSebastianZolnowskiTest {
    PositiveNumberNegativeNumber checkNumber = new PositiveNumberNegativeNumber();

    @Test
    public void checkIfNumber2IsPositive() throws Exception {
        String result = checkNumber.checkIfPositiveOrNegative(2);
        String expected = "The number is positive";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfNumber10IsPositive() throws Exception {
        String result = checkNumber.checkIfPositiveOrNegative(10);
        String expected = "The number is positive";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfNumberMinus3IsNegative() throws Exception {
        String result = checkNumber.checkIfPositiveOrNegative(-3);
        String expected = "The number is negative";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfNumberMinus23IsNegative() throws Exception {
        String result = checkNumber.checkIfPositiveOrNegative(-23);
        String expected = "The number is negative";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfNumber13IsNotNegative() throws Exception {
        String result = checkNumber.checkIfPositiveOrNegative(13);
        String expected = "The number is negative";
        assertNotEquals(expected, result);
    }

    @Test
    public void checkIfNumberMinusOneIsPositive() throws Exception {
        String result = checkNumber.checkIfPositiveOrNegative(-1);
        String expected = "The number is positive";
        assertNotEquals(expected, result);
    }

    @Test
    public void checkIfZeroIsZero() throws Exception {
        String result = checkNumber.checkIfPositiveOrNegative(0);
        String expected = "The number is 0";
        assertEquals(expected, result);
    }
}