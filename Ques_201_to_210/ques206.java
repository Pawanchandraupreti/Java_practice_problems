package Ques_201_to_210;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Find the Most Frequent Element in an Array

public class ques206 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 3, 4, 3, 2, 3, 5};
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : numbers) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        int mostFrequent = Collections.max(frequency.entrySet(), 
            Map.Entry.comparingByValue()).getKey();
            
        
        System.out.println("Most frequent number: " + mostFrequent);
    }
}
