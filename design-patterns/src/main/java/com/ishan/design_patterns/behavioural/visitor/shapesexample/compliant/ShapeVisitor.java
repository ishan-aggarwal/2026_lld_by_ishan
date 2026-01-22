package com.ishan.design_patterns.behavioural.visitor.shapesexample.compliant;

public interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
