package com.ishan.design_patterns.behavioural.visitor.shapesexample.compliant;

public class PerimeterVisitor implements ShapeVisitor {

    private double totalPerimeter = 0;

    @Override
    public void visit(Circle circle) {
        totalPerimeter += 2 * Math.PI * circle.radius;
    }

    @Override
    public void visit(Rectangle rectangle) {
        totalPerimeter += 2 * (rectangle.length + rectangle.width);
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }
}
