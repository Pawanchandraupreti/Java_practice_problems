package Ques_251_to_260;

import java.util.HashSet;
import java.util.Set;

// Find the Duplicate Elements in an Array

public class ques256 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 6, 7, 7};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        System.out.println("Duplicate elements: " + duplicates);
    }
}