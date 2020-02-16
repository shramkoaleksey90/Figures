package com.testmatick;

public class Triangle extends Figure{

    private int triangleBase;
    private int height;

    public Triangle(int triangleBase, int height) {
        if(triangleBase == 0 || height == 0) throw new IllegalArgumentException("it is a line, not a triangle");
        this.triangleBase = triangleBase;
        this.height = height;
    }

    public double getHypotenuse(){
        return Math.sqrt((height*height)+(triangleBase*triangleBase));
    }

    @Override
    public double getArea() {
        return 0.5*triangleBase*height;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", " +
                "area: " + getArea() + ", " +
                "hypotenuse: " + rounding(getHypotenuse()) + ", " +
                "color: " + getColor();
    }
}
