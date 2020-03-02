package com.testmatick;

import com.testmatick.figures.Quadrate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadrateTest {
    Quadrate quadrate = new Quadrate(5);
    @Test
    void getArea() {
        assertEquals(25.0,quadrate.getArea());
    }

    @Test
    void ifSideNegative() {
        assertThrows(ArithmeticException.class,
                ()-> new Quadrate(-5));
    }
}