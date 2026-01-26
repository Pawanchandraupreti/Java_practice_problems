package Ques_291_to_300;

// Calculate the Covariance of Two Arrays

public class ques298 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 3, 5, 7, 11};
        
        double xSum = 0, ySum = 0;
        for (int i = 0; i < x.length; i++) {
            xSum += x[i];
            ySum += y[i];
        }
        double xMean = xSum / x.length;
        double yMean = ySum / x.length;
        
        double covariance = 0;
        for (int i = 0; i < x.length; i++) {
            covariance += (x[i] - xMean) * (y[i] - yMean);
        }
        covariance /= x.length;
        
        System.out.printf("Covariance: %.4f%n", covariance);
    }
}