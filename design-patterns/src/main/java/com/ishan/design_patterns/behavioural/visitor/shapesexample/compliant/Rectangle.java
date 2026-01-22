package com.ishan.design_patterns.behavioural.visitor.shapesexample.compliant;

public class Rectangle implements Shape {
    public final double length;
    public final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
