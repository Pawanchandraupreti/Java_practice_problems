
// Create a Simple Text-Based Word Length Analyzer

import java.util.Scanner;

public class ques279 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        int totalLength = 0;
        
        System.out.println("\nWord Length Analysis:");
        for (String word : words) {
            int length = word.length();
            System.out.println(word + ": " + length + " letters");
            totalLength += length;
        }
        
        double averageLength = (double) totalLength / words.length;
        System.out.printf("\nAverage word length: %.2f letters%n", averageLength);
    }
}
