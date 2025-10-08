package Ques_221_to_230;

import java.util.Arrays;

// Find the Kth Largest Element in an Array

public class ques226 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
        int k = 3; // Find 3rd largest
        
        Arrays.sort(numbers);
        int kthLargest = numbers[numbers.length - k];
        
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println(k + "rd largest element: " + kthLargest);
    }
}
