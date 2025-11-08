package Ques_241_to_250;

// Calculate the Root Mean Square (RMS) of Numbers

public class ques248 {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double sumOfSquares = 0;
        
        for (double num : numbers) {
            sumOfSquares += num * num;
        }
        
        double rms = Math.sqrt(sumOfSquares / numbers.length);
        System.out.printf("Root Mean Square: %.2f%n", rms);
    }
}


