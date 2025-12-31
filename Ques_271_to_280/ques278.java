// Calculate the Median Absolute Deviation

import java.util.Arrays;

public class ques278 {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6, 100};
        Arrays.sort(numbers);
        
        double median;
        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length/2 - 1] + numbers[numbers.length/2]) / 2.0;
        } else {
            median = numbers[numbers.length/2];
        }
        
        double[] absoluteDeviations = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            absoluteDeviations[i] = Math.abs(numbers[i] - median);
        }
        Arrays.sort(absoluteDeviations);
        
        double mad;
        if (absoluteDeviations.length % 2 == 0) {
            mad = (absoluteDeviations[absoluteDeviations.length/2 - 1] + 
                  absoluteDeviations[absoluteDeviations.length/2]) / 2.0;
        } else {
            mad = absoluteDeviations[absoluteDeviations.length/2];
        }
        
        System.out.printf("Median: %.2f%n", median);
        System.out.printf("Median Absolute Deviation: %.2f%n", mad);
    }
}

