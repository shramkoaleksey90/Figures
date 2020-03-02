package com.testmatick.figures;

import com.testmatick.drawing.Drawable;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public abstract class Figure{

    public String figureName = this.getClass().getSimpleName();
    private String figureColor;
    private  List<Colors> colorsList = Arrays.asList(Colors.values());
    protected Drawable drawable;

    public abstract double getArea();
    public void executeDrawing(){
        drawable.draw();
    }

    public String getFigureColor() {
        return figureColor.toLowerCase();
    }

    public void setFigureColor(int numberOfColor) {
        if (numberOfColor < 0 || numberOfColor > 9) throw new IndexOutOfBoundsException("I don't have this color");
        figureColor = String.valueOf(colorsList.get(numberOfColor));
    }

    public double rounding(double value){
        BigDecimal bigDecimal = new BigDecimal(value);
        value = bigDecimal.setScale(1,4).doubleValue();
        return value;
    }

    private enum Colors {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        VIOLET,
        BLACK,
        BROWN,
        WHITE,
        GRAY
    }

}
