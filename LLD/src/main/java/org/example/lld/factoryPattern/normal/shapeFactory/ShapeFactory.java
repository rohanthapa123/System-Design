package org.example.lld.factoryPattern.normal.shapeFactory;

import org.example.lld.factoryPattern.normal.shape.Circle;
import org.example.lld.factoryPattern.normal.shape.Rectangle;
import org.example.lld.factoryPattern.normal.shape.Shape;
import org.example.lld.factoryPattern.normal.shape.Square;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "CIRCLE":
                return new Circle();

            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();

            default:
                return null;
        }
    }
}
