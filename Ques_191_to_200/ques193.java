package Ques_191_to_200;

// Calculate the Average of Array Elements

public class ques193 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;
        System.out.printf("Average: %.2f%n", average);
    }
}
