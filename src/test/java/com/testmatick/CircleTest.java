package com.testmatick;

import com.testmatick.figures.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle(5);
        assertEquals(78.5,circle.getArea());
    }
}