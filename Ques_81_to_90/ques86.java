package Ques_81_to_90;

// Factory Pattern with Lambda Expressions (Java 8+)

import java.util.*;
import java.util.function.*;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Drawing Rectangle"); }
}

public class ques86 {
    private static final Map<String, Supplier<Shape>> SHAPES = Map.of(
        "CIRCLE", Circle::new,
        "RECTANGLE", Rectangle::new
    );

    public static Shape createShape(String type) {
        return Optional.ofNullable(SHAPES.get(type.toUpperCase()))
                      .orElseThrow(() -> new IllegalArgumentException("Invalid shape type"))
                      .get();
    }

    public static void main(String[] args) {
        Shape circle = ques86.createShape("circle");
        circle.draw(); // Output: Drawing Circle
    }
}


