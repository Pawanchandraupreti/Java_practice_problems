package Ques_121_to_130;

import java.util.Random;
import java.util.Scanner;

// Number Guessing Game

public class ques122 {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Guess a number between 1-100:");
        while (true) {
            int guess = sc.nextInt();
            if (guess == secret) {
                System.out.println("Correct!");
                break;
            }
            System.out.println("Too " + (guess < secret ? "low" : "high"));
        }
    }
}
