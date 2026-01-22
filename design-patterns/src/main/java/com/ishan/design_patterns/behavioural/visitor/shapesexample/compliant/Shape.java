package com.ishan.design_patterns.behavioural.visitor.shapesexample.compliant;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
