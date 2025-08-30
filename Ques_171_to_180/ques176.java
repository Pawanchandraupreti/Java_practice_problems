package Ques_171_to_180;

// Find the Second Largest Number in an Array

public class ques176 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println("Second largest: " + secondLargest);
    }
}
