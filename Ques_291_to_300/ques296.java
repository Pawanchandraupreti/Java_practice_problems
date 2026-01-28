package Ques_291_to_300;

// Find the Subarray with Maximum Sum (Kadane's Algorithm)

public class ques296 {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoFar = numbers[0];
        int maxEndingHere = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            maxEndingHere = Math.max(numbers[i], maxEndingHere + numbers[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        System.out.println("Maximum subarray sum: " + maxSoFar);
    }
}