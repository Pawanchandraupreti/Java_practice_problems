package Ques_71_to_80;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Immutable Collections (Java 9+)

public class ques73 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Set<Integer> numbers = Set.of(1, 2, 3);
        Map<String, Integer> scores = Map.of("Alice", 90, "Bob", 85);
        
        System.out.println(names);
        System.out.println(scores);
    }
}
