package Ques_41_to_50;

//Static vs Instance Members

class Counter {
    static int staticCount = 0;
    int instanceCount = 0;
    
    void increment() {
        staticCount++;
        instanceCount++;
    }
    
    void display() {
        System.out.println("Static: " + staticCount + ", Instance: " + instanceCount);
    }
}

public class ques43 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        
        c1.increment();
        c2.increment();
        c2.increment();
        
        c1.display();
        c2.display();
    }
}

