package Ques_291_to_300;

import java.util.Random;

// Create a Simple Text-Based Random Advice Generator

public class ques295 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] advices = {
            "Take a deep breath and start with one small step.",
            "Don't compare your chapter 1 to someone else's chapter 20.",
            "The expert in anything was once a beginner.",
            "Progress, not perfection.",
            "If you're going through hell, keep going.",
            "Your only limit is you.",
            "The best way to predict the future is to create it.",
            "Success is not final, failure is not fatal: it is the courage to continue that counts."
        };
        
        System.out.println("Random Advice for Today:");
        System.out.println(advices[rand.nextInt(advices.length)]);
    }
}

