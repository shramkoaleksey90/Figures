package com.testmatick;

public class Circle extends Figure {

    private int circleRadius;
    private static final double PI = 3.14;

    public Circle(int circleRadius) {
        if(circleRadius == 0) throw new IllegalArgumentException("it is a point, not a circle");
        this.circleRadius = circleRadius;
    }

    @Override
    public double getArea() {
        return PI*(circleRadius * circleRadius);
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    @Override
    public String toString() {
        return "Figure: " + figureName + ", " +
                "area: " + rounding(getArea()) + ", " +
                "radius: " + getCircleRadius() + ", " +
                "color: " + getFigureColor();
    }

    public void setCircleRadius(int circleRadius) {
        Circle circle = new Circle(circleRadius);
    }
}
