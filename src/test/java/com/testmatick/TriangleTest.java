package com.testmatick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle = new Triangle(4,5);

    @Test
    void getHypotenuse() {
      assertEquals(6.4031242374328485,triangle.getHypotenuse()
      );
    }

    @Test
    void getArea() {
        assertEquals(10,triangle.getArea());
    }
}