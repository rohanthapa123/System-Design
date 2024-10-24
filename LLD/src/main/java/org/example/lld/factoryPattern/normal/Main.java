package org.example.lld.factoryPattern.normal;

import org.example.lld.factoryPattern.normal.shape.Shape;
import org.example.lld.factoryPattern.normal.shapeFactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape sq = shapeFactory.getShape("CIRCLE");
        sq.draw();

        Shape sq1 = shapeFactory.getShape("RECTANGLE");
        sq1.draw();

        Shape sq2 = shapeFactory.getShape("SQUARE");
        sq2.draw();



    }
}
