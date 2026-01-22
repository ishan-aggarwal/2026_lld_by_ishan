package com.ishan.design_patterns.behavioural.visitor.shapesexample.violated;

import java.util.List;

public class AreaCalculator {

    public static double totalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}

/***
 * ❗ Why This Is Bad
 * If tomorrow you add perimeter, you must:
 *  Modify Shape
 *  Modify Circle
 *  Modify Rectangle
 *  High ripple effect.
 */