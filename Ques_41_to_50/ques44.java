package Ques_41_to_50;

//Composition Pattern

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;
    
    Car() {
        this.engine = new Engine();
    }
    
    void startCar() {
        engine.start();
        System.out.println("Car is ready to drive");
    }
}

public class ques44 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
