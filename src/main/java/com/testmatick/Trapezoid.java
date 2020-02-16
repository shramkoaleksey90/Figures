package com.testmatick;

public class Trapezoid extends Figure{

    private int largerBase, smallerBase, leftSide, rightSide;
    private double height;

    public Trapezoid(int largerBase, int smallerBase, int leftSide) {
        if(largerBase <= smallerBase)
            throw new IllegalArgumentException(
                    "A larger base is equal to or less than a smaller base of the figure");
        this.largerBase = largerBase;
        this.smallerBase = smallerBase;
        this.leftSide = leftSide;
        rightSide = leftSide;
        calculateHeight();
    }

    private void calculateHeight() {
        height = Math.sqrt(
                (leftSide * leftSide) - 0.25*Math.pow((
                        ((leftSide * leftSide)-(rightSide * rightSide))/(largerBase - smallerBase)
                                + largerBase - smallerBase),2)
        );
    }

    @Override
    public double getArea() {
        return ((largerBase + smallerBase)/2)*height;
    }

    public double getHeight() {
            return height;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", " +
                "area: " + rounding(getArea())+ ", " +
                "height: " + rounding(getHeight()) + ", " +
                "color: " + getColor();
    }
}
