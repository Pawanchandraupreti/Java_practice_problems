package Ques_231_to_240;

// Calculate the Geometric Mean of an Array

public class ques238 {
    public static void main(String[] args) {
        double[] numbers = {2, 4, 8, 16};
        double product = 1;
        
        for (double num : numbers) {
            product *= num;
        }
        
        double geometricMean = Math.pow(product, 1.0 / numbers.length);
        System.out.printf("Geometric mean: %.2f%n", geometricMean);
    }
}
