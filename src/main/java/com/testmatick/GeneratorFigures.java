package com.testmatick;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorFigures {

    private List<Figure> figures = new ArrayList<>();
    private Random random = new Random();

    void generateListOfFigures(){
        int countOfFigure =  random.nextInt(50)+1;
        for (int i = 0; i < countOfFigure; i++) {
            int numberOfFigure = random.nextInt(4);
            switch (numberOfFigure){
                case 0:
                    int radius = random.nextInt(10)+1;
                    figures.add(new Circle(radius));
                    break;
                case 1:
                    int side = random.nextInt(10)+1;
                    figures.add(new Quadrate(side));
                    break;
                case 2:
                    int largerBase = 4;
                    int smallerBase = 2;
                    int oneOfSide = 3;
                    figures.add(new Trapezoid(largerBase,smallerBase,oneOfSide));
                    break;
                default:
                    int triangleBase = random.nextInt(10)+1;
                    int height = random.nextInt(10)+1;
                    figures.add(new Triangle(triangleBase,height));
                    break;
            }
        }

        for (Figure figure : figures) {
            figure.setColor(random.nextInt(10));
        }
    }

    public List<Figure> getFigures() {
        return figures;
    }
}
