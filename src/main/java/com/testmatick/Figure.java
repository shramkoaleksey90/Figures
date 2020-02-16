package com.testmatick;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public abstract class Figure implements Draw{

    private String color;
    public String name = this.getClass().getSimpleName();
    private final List<Colors> colorsList = new ArrayList<>(EnumSet.allOf(Colors.class));

    public abstract double getArea();

    @Override
    public void draw() {
        System.out.println( "I draw "+ this.getClass().getSimpleName());
    }

    public String getColor() {
        return color.toLowerCase();
    }

    public void setColor(int numberOfColor) {
        if (numberOfColor < 0 || numberOfColor > 9) throw new IndexOutOfBoundsException("I don't have this color");
        color = String.valueOf(colorsList.get(numberOfColor));
    }

    public double rounding(double value){
        BigDecimal bigDecimal = new BigDecimal(value);
        value = bigDecimal.setScale(1,4).doubleValue();
        return value;
    }
}
