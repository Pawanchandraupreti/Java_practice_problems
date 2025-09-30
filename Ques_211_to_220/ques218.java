package Ques_211_to_220;

import java.util.Arrays;

// Calculate the Median of an Array

public class ques218 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 2, 5, 6, 7};
        Arrays.sort(numbers);
        
        double median;
        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length/2 - 1] + numbers[numbers.length/2]) / 2.0;
        } else {
            median = numbers[numbers.length/2];
        }
        
        
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Median: " + median);
    }
}
