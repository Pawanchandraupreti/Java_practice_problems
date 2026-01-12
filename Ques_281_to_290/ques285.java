package Ques_281_to_290;

import java.time.LocalDate;
import java.util.Random;

// Create a Simple Text-Based Random Quote of the Day

public class ques285 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] quotes = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Life is 10% what happens to us and 90% how we react to it. - Charles R. Swindoll",
            "The best time to plant a tree was 20 years ago. The second best time is now. - Chinese Proverb",
            "You miss 100% of the shots you don't take. - Wayne Gretzky",
            "Whether you think you can or you think you can't, you're right. - Henry Ford",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "It does not matter how slowly you go as long as you do not stop. - Confucius",
            "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt"
        };
        
        // Use date to get consistent quote per day
        LocalDate today = LocalDate.now();
        int dayOfYear = today.getDayOfYear();
        Random dailyRand = new Random(dayOfYear); // Seed with day of year
        
        System.out.println("Quote of the Day (" + today + "):");
        System.out.println(quotes[dailyRand.nextInt(quotes.length)]);
    }
}

