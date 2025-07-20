package Ques_11_to_20;

//Create an abstract class Shape with abstract method area(), then implement it for Circle and Rectangle.

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    
    Circle(double r) { this.radius = r; }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    
    @Override
    double area() {
        return length * width;
    }
}
public class ques20 {
     public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}
