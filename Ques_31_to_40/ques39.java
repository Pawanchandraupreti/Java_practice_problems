package Ques_31_to_40;

//Method Overriding

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class ques39 {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw();
    }
}
