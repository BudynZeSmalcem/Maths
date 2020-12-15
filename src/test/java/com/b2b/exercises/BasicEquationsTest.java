package com.b2b.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BasicEquationsTest {
    BasicEquations basicEquations = new BasicEquations();

    @Test
    public void number3times10() throws Exception {
        int result = basicEquations.multiplyBy10(3);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void notEquals3Times10() throws Exception {
        int result = basicEquations.multiplyBy10(3);
        assertNotEquals(29, result);
    }

    @Test
    public void notEquals4Times10() throws Exception {
        int result = basicEquations.multiplyBy10(40);
        assertNotEquals(41, result);
    }

    @Test
    public void number5times10() throws Exception {
        int result = basicEquations.multiplyBy10(5);
        int expected = 50;
        assertEquals(expected, result);
    }

    @Test
    public void notEquals89Times10() throws Exception {
        int result = basicEquations.multiplyBy10(89);
        assertNotEquals(879, result);
    }

    @Test
    public void notEquals34Times10() throws Exception {
        int result = basicEquations.multiplyBy10(34);
        assertNotEquals(341, result);
    }

    @Test
    public void squareFieldIs20() throws Exception {
        int result = basicEquations.squareField(5);
        assertEquals(20, result);
    }

    @Test
    public void squareFieldIs48() throws Exception {
        int result = basicEquations.squareField(12);
        assertEquals(48, result);
    }

    @Test
    public void squareFieldIsNot21() throws Exception {
        int result = basicEquations.squareField(5);
        assertNotEquals(21, result);
    }

    @Test
    public void squareFieldIs47() throws Exception {
        int result = basicEquations.squareField(12);
        assertNotEquals(47, result);
    }

    @Test
    public void perimeterOfTheSquareIs25() throws Exception {
        int result = basicEquations.perimeterOfTheSquare(5);
        assertEquals(25, result);
    }

    @Test
    public void perimeterOfTheSquareIs144() throws Exception {
        int result = basicEquations.perimeterOfTheSquare(12);
        assertEquals(144, result);
    }

    @Test
    public void perimeterOfTheSquareIsNot26() throws Exception {
        int result = basicEquations.perimeterOfTheSquare(5);
        assertNotEquals(26, result);
    }

    @Test
    public void perimeterOfTheSquareIsNot143() throws Exception {
        int result = basicEquations.perimeterOfTheSquare(12);
        assertNotEquals(143, result);
    }

 @Test
    public void equationResultIs316() throws Exception {
        int result = basicEquations.equation(36,11);
        assertEquals(322, result);
    }

    @Test
    public void equationResultIsMinus14() throws Exception {
        int result = basicEquations.equation(4,-2);
        assertEquals(-30, result);
    }

    @Test
    public void equationResultIsNot4() throws Exception {
        int result = basicEquations.equation(-2,4);
        assertNotEquals(4, result);
    }

    @Test
    public void equationResultIsNotMinus712() throws Exception {
        int result = basicEquations.equation(11,36);
        assertNotEquals(-712, result);
    }


}