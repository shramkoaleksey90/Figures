package com.testmatick;

import com.testmatick.figures.Figure;
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
        figure.setFigureColor(0);
        assertEquals("red",figure.getFigureColor());
    }
}