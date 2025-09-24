package Ques_201_to_210;

// Calculate the Standard Deviation of Numbers

public class ques208 {
    public static void main(String[] args) {
        double[] numbers = {10, 12, 23, 23, 16, 23, 21, 16};
        double sum = 0;
        
        for (double num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.length;
        
        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - mean, 2);
        }
        
        variance /= numbers.length;
        
        double stdDev = Math.sqrt(variance);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);
    }
}
