package com.b2b.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AgeTest {
    Age age = new Age();

    @Test
    public void isAdult18() throws Exception {
        String result = age.age(18);
        String expected = "You are adult:-)";
        assertEquals(expected, result);
    }

    @Test
    public void isAdult25() throws Exception {
        String result = age.age(25);
        String expected = "You are adult:-)";
        assertEquals(expected, result);
    }

    @Test
    public void isNotAdult13() throws Exception {
        String result = age.age(13);
        String expected = "You are not adult";
        assertEquals(expected, result);
    }

    @Test
    public void isNotAdult17() throws Exception {
        String result = age.age(17);
        String expected = "You are not adult";
        assertEquals(expected, result);
    }

    @Test
    public void expectedNotEquals23() throws Exception {
        String result = age.age(23);
        String notExpected = "You are not adult";
        assertNotEquals(notExpected, result);
    }

    @Test
    public void expectedNotEquals12() throws Exception {
        String result = age.age(12);
        String notExpected = "You are adult:-)";
        assertNotEquals(notExpected, result);
    }

    @Test
    public void expectedNoAge() throws Exception {
        String result = age.age(-12);
        String notExpected = "There is no age like this";
        assertEquals(notExpected, result);
    }
}