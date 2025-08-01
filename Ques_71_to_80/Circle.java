package Ques_71_to_80;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double r) { this.radius = r; }
    
    @Override
    double area() { return Math.PI * radius * radius; }
}