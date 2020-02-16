package com.testmatick;

public class Circle extends Figure {

    private int radius;
    private static final double PI = 3.14;

    public Circle(int radius) {
        if(radius == 0) throw new IllegalArgumentException("it is a point, not a circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*(radius*radius);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", " +
                "area: " + rounding(getArea()) + ", " +
                "radius: " + getRadius() + ", " +
                "color: " + getColor();
    }

    public void setRadius(int radius) {
        Circle circle = new Circle(radius);
    }
}
