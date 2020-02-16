package com.testmatick;

public class Quadrate extends Figure{

    private int side;

    Quadrate(int side) {
        if(side < 0) throw new ArithmeticException("The side of the square cannot be a negative number");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        Quadrate quadrate = new Quadrate(side);
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", " +
                "area: " + getArea() + ", " +
                "side: " + getSide() + ", " +
                "color: " + getColor();
    }
}
