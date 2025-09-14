package Ques_171_to_180;

import java.util.Random;

// Create a Simple Text-Based Slot Machine

public class ques179 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] symbols = {"🍒", "🍋", "🍊", "⭐", "7️⃣"};
        
        System.out.println("Spinning the slots...");
        
        String result1 = symbols[rand.nextInt(symbols.length)];
        String result2 = symbols[rand.nextInt(symbols.length)];
        
        String result3 = symbols[rand.nextInt(symbols.length)];
        
        
        System.out.println(result1 + " " + result2 + " " + result3);
        
        if (result1.equals(result2) && result2.equals(result3)) {
            System.out.println("JACKPOT! 🎉");
            
        } else if (result1.equals(result2) || result2.equals(result3) || result1.equals(result3)) {
            System.out.println("Two matches! Almost there!");
        } else {
            System.out.println("Try again!");
        }
    }
}
