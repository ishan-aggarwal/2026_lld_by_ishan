package com.ishan.design_patterns.behavioural.visitor.shapesexample.compliant;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(10),
                new Rectangle(5, 4)
        );

        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
            shape.accept(perimeterVisitor);
        }

        System.out.println("Total Area: " + areaVisitor.getTotalArea());
        System.out.println("Total Perimeter: " + perimeterVisitor.getTotalPerimeter());
    }
}
