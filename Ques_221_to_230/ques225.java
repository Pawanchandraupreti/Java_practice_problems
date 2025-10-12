package Ques_221_to_230;

import java.util.Random;

// Create a Simple Text-Based Fortune Cookie

public class ques225 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] fortunes = {
            "You will have a great day today!",
            "A surprise is waiting for you around the corner.",
            "Good news will come to you by mail.",
            "You will travel to many places.",
            "Your hard work will soon pay off.",
            "A dream you have will come true.",
            "Someone is thinking of you."
        };
        
        
        String fortune = fortunes[rand.nextInt(fortunes.length)];
        System.out.println("Your fortune: " + fortune);
        System.out.println("Lucky numbers: " + 
            (rand.nextInt(99) + 1) + ", " + 
            (rand.nextInt(99) + 1) + ", " + 
            (rand.nextInt(99) + 1));
    }
}
