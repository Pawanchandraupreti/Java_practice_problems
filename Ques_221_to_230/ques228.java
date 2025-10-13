package Ques_221_to_230;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Calculate the Mode of an Array

public class ques228 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 3, 4, 3, 2, 3, 5};
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : numbers) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        
        
        int maxFrequency = Collections.max(frequency.values());
        System.out.print("Mode(s): ");
        
        
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println("(appears " + maxFrequency + " times)");
    }
}
