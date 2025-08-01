package Ques_71_to_80;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// ConcurrentHashMap Usage

public class ques71 {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> scores = new ConcurrentHashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        
        scores.forEach((name, score) -> 
            System.out.println(name + ": " + score));
            
        System.out.println("Alice's score: " + scores.get("Alice"));
    }
}
