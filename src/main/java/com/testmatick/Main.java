package com.testmatick;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GeneratorFigures generatorFigures = new GeneratorFigures();
        generatorFigures.generateListOfFigures();
        List<Figure>  figures = generatorFigures.getFigures();

        for (Figure figure : figures) {
            System.out.println(figure);
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
