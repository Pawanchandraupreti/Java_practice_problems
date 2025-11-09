package Ques_241_to_250;

// Find the Missing Number in a Sequence

public class ques246 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 8, 9, 10}; // Missing 4
        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : numbers) {
            actualSum += num;
        }
        
        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);
    }
}


