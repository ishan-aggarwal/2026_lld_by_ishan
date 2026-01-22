package com.ishan.design_patterns.behavioural.visitor.shapesexample.compliant;

public class AreaVisitor implements ShapeVisitor {

    private double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * circle.radius * circle.radius;
    }

    @Override
    public void visit(Rectangle rectangle) {
        totalArea += rectangle.length * rectangle.width;
    }

    public double getTotalArea() {
        return totalArea;
    }
}
