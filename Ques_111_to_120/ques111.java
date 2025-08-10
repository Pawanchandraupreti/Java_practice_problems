package Ques_111_to_120;

// Find Missing Number in Sequence (1-100)

public class ques111 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10, /*...*/ 99}; // Missing 100
        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}
