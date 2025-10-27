package Ques_231_to_240;

import java.util.Arrays;

// Find the Longest Consecutive Sequence in an Array

public class ques236 {
    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};
        Arrays.sort(numbers);
        
        int longest = 1;
        int current = 1;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i-1] + 1) {
                current++;
                longest = Math.max(longest, current);
            } else if (numbers[i] != numbers[i-1]) {
                current = 1;
            }
        }
        
        System.out.println("Longest consecutive sequence: " + longest);
    }
}
