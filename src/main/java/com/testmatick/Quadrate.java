package com.testmatick;

public class Quadrate extends Figure{

    private int quadrateSide;

    public Quadrate(int quadrateSide) {
        if(quadrateSide < 0) throw new ArithmeticException("The side of the square cannot be a negative number");
        this.quadrateSide = quadrateSide;
    }

    @Override
    public double getArea() {
        return quadrateSide * quadrateSide;
    }

    public int getQuadrateSide() {
        return quadrateSide;
    }

    public void setQuadrateSide(int quadrateSide) {
        Quadrate quadrate = new Quadrate(quadrateSide);
    }

    @Override
    public String toString() {
        return "Figure: " + figureName + ", " +
                "area: " + getArea() + ", " +
                "side: " + getQuadrateSide() + ", " +
                "color: " + getFigureColor();
    }
}
