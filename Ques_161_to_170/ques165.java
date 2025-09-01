package Ques_161_to_170;

import java.util.Random;

// Generate a Random Quote Generator

public class ques165 {
    public static void main(String[] args) {
        String[] quotes = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "Be yourself; everyone else is already taken. - Oscar Wilde",
            "You only live once, but if you do it right, once is enough. - Mae West"
        };
        
        
        Random rand = new Random();
        System.out.println("Today's quote:");
        System.out.println(quotes[rand.nextInt(quotes.length)]);
    }
}
