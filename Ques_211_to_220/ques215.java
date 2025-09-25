package Ques_211_to_220;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Text-Based Magic 8-Ball

public class ques215 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] answers = {
            "Yes, definitely", "No, definitely not", "Maybe", 
            "Ask again later", "Outlook good", "Outlook not so good",
            "Cannot predict now", "Signs point to yes"
        };
        System.out.print("Ask the Magic 8-Ball a question: ");
        scanner.nextLine();
        
        String answer = answers[rand.nextInt(answers.length)];
        System.out.println("Magic 8-Ball says: " + answer);
    }
}
