package Ques_51_to_60;

import java.util.function.*;

// Simple Lambda Expressions

public class ques54 {
    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 5 even? " + isEven.test(5));
        
        // Function example
        Function<String, Integer> wordLength = s -> s.length();
        System.out.println("'Hello' length: " + wordLength.apply("Hello"));
        
        // Runnable example
        Runnable greeting = () -> System.out.println("Hello Lambda!");
        greeting.run();
    }
}
