package com.b2b.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BiggerNumberTest {
    BiggerNumber biggerNumber = new BiggerNumber();

    @Test
    public void if30IsbiggerNumber() throws Exception {
        String result = biggerNumber.biggerNumber(12, 30);
        String expected = "30";
        assertEquals(expected, result);
    }

    @Test
    public void if15IsbiggerNumber() throws Exception {
        String result = biggerNumber.biggerNumber(15, 5);
        String expected = "15";
        assertEquals(expected, result);
    }

    @Test
    public void ifTheSameNumbers() throws Exception {
        String result = biggerNumber.biggerNumber(12, 12);
        String expected = "equals";
        assertEquals(expected, result);
    }

    @Test
    public void if33IsNotbiggerNumber() throws Exception {
        String result = biggerNumber.biggerNumber(33, 99);
        String expected = "33";
        assertNotEquals(expected, result);
    }

    @Test
    public void if12IsNotbiggerNumber() throws Exception {
        String result = biggerNumber.biggerNumber(33, 12);
        String expected = "12";
        assertNotEquals(expected, result);
    }
}