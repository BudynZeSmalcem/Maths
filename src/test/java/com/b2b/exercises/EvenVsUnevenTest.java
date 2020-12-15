package com.b2b.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EvenVsUnevenTest {
    EvenVsUneven no = new EvenVsUneven();

    @Test
    public void isNo4Even() throws Exception {
        String result = no.isEvenOrIsUneven(4);
        String expected = "even";
        assertEquals(expected, result);
    }

    @Test
    public void isNo3Uneven() throws Exception {
        String result = no.isEvenOrIsUneven(3);
        String expected = "uneven";
        assertEquals(expected, result);
    }

    @Test
    public void isNo2Uneven() throws Exception {
        String result = no.isEvenOrIsUneven(2);
        String expected = "uneven";
        assertNotEquals(expected, result);
    }

    @Test
    public void isNo5Even() throws Exception {
        String result = no.isEvenOrIsUneven(5);
        String expected = "even";
        assertNotEquals(expected, result);
    }

    @Test
    public void isNo1Uneven() throws Exception {
        String result = no.isEvenOrIsUneven(1);
        String expected = "uneven";
        assertEquals(expected, result);
    }

    @Test
    public void isNo0Even() throws Exception {
        String result = no.isEvenOrIsUneven(0);
        String expected = "even";
        assertEquals(expected, result);
    }

}