package Ques_251_to_260;

// Calculate the Harmonic Mean of Numbers

public class ques258 {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double reciprocalSum = 0;
        
        for (double num : numbers) {
            reciprocalSum += 1.0 / num;
        }
        
        double harmonicMean = numbers.length / reciprocalSum;
        System.out.printf("Harmonic mean: %.2f%n", harmonicMean);
    }
}
