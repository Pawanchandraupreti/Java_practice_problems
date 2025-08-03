package Ques_81_to_90;

import java.util.Arrays;
import java.util.List;

// Lambda Expressions with Collections

public class ques84 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // forEach with lambda
        names.forEach(name -> System.out.println("Hello, " + name));
        
        // RemoveIf with predicate
        names.removeIf(name -> name.length() > 5);
        System.out.println("Short names: " + names);
        
        // Comparator with lambda
        names.sort((a, b) -> b.compareTo(a)); // Reverse order
        System.out.println("Sorted: " + names);
    }
}
