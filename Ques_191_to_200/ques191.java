package Ques_191_to_200;

import java.util.LinkedHashSet;
import java.util.Set;

// Find All Unique Elements in an Array

public class ques191 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 6};
        Set<Integer> unique = new LinkedHashSet<>();
        
        for (int num : numbers) {
            unique.add(num);
        }
        
        System.out.println("Unique elements: " + unique);
    }
}
