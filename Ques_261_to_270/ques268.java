package Ques_261_to_270;

// Calculate the Arithmetic Mean of Numbers

public class ques268 {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50};
        double sum = 0;
        
        for (double num : numbers) {
            sum += num;
        }
        
        double mean = sum / numbers.length;
        System.out.printf("Arithmetic mean: %.2f%n", mean);
    }
}
