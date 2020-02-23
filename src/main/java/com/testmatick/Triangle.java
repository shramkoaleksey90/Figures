package com.testmatick;

public class Triangle extends Figure{

    private int triangleBase;
    private int triangleHeight;

    public Triangle(int triangleBase, int triangleHeight) {
        if(triangleBase == 0 || triangleHeight == 0) throw new IllegalArgumentException("it is a line, not a triangle");
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    public double getHypotenuse(){
        return Math.sqrt((triangleHeight * triangleHeight)+(triangleBase*triangleBase));
    }

    @Override
    public double getArea() {
        return 0.5*triangleBase* triangleHeight;
    }

    @Override
    public String toString() {
        return "Figure: " + figureName + ", " +
                "area: " + getArea() + ", " +
                "hypotenuse: " + rounding(getHypotenuse()) + ", " +
                "color: " + getFigureColor();
    }
}
