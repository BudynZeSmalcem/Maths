package com.b2b.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RestFromDivisionTest {

    RestFromDivision rest = new RestFromDivision();

    @Test
    public void restFrom23DividedBy4() throws Exception {
        double result = rest.rest(23, 4);
        double expected = 3;
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void restFrom7DividedByMinus3() throws Exception {
        double result = rest.rest(7, -3);
        double expected = 1;
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void restFromMinus7DividedBy3() throws Exception {
        double result = rest.rest(-7, 3);
        double expected = -1;
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void restFromMinus7DividedByMinus3() throws Exception {
        double result = rest.rest(-7, -3);
        double expected = -1;
        assertEquals(expected, result, 0.0);
    }

    @Test(expected = Exception.class)
    public void restFrom7DividedByMinus0() throws Exception {
        double result = rest.rest(7, 0);
        assertEquals("can't divide by zero!!", result);
    }

    @Test
    public void notEqualsDividedBy4() throws Exception {
        double result = rest.rest(24, 4);
        double expected = 4;
        assertNotEquals(expected, result);
    }
}