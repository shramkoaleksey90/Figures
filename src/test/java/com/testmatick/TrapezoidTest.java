package com.testmatick;

import com.testmatick.figures.Trapezoid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {
    Trapezoid trapezoid = new Trapezoid(4,2,5);
    @Test
    void getHeight() {
        assertEquals(4.898979485566356,trapezoid.getTrapezoidHeight());
    }

    @Test
    void getArea() {
        assertEquals(14.696938456699067,trapezoid.getArea());
    }
}