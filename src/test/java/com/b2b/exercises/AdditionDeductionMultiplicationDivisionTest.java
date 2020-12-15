package com.b2b.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AdditionDeductionMultiplicationDivisionTest {
    AdditionDeductionMultiplicationDivision exercise = new AdditionDeductionMultiplicationDivision();

    @Test
    public void checkAddition() throws Exception {
        double result = exercise.addition(3, 2);
        double expected = 5.0;
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void checkIfNotEqualsAddition() throws Exception {
        double result = exercise.addition(3.5, 2);
        double expected = 5.0;
        assertNotEquals(expected, result, 0.0);
    }

    @Test
    public void checkDeduction() throws Exception {
        double result = exercise.deduction(2, 3);
        double expected = -1.0;
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void checkIfNotEqualsDeduction() throws Exception {
        double result = exercise.deduction(2.3, 3);
        double expected = -1.0;
        assertNotEquals(expected, result, 0.0);
    }

    @Test
    public void checkMultiplication() throws Exception {
        double result = exercise.multiplication(2, 3);
        double expected = 6.0;
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void checkIfNotEqualsMultiplication() throws Exception {
        double result = exercise.multiplication(2, 3.5);
        double expected = 6.0;
        assertNotEquals(expected, result, 0.0);
    }

    @Test
    public void checkDivision3And2() throws Exception {
        double result = exercise.division(3, 2);
        double expected = 1.5;
        assertEquals(expected, result, 0.0);
    }

    @Test(expected = Exception.class)
    public void checkDivisionBy0() throws Exception {
        double result = exercise.division(3, 0);
        assertEquals("Do not divide by zero!", result);
    }

}