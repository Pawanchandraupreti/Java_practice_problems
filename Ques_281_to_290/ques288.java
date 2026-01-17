package Ques_281_to_290;

// Calculate the Variance of Numbers

public class ques288 {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50};
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
        
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Variance: %.2f%n", variance);
        System.out.printf("Standard Deviation: %.2f%n", Math.sqrt(variance));
    }
}


