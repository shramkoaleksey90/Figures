package com.testmatick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    void setColor() {
        Figure figure = new Figure() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        figure.setColor(0);
        assertEquals("red",figure.getColor());
    }
}