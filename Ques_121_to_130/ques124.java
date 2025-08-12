package Ques_121_to_130;

// Validate Credit Card Number (Luhn Check)

public class ques124 {
    public static void main(String[] args) {
        String cardNumber = "4532015112830366"; // Example valid number
        int sum = 0;
        boolean alternate = false;
        
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            if (alternate) {
                digit *= 2;
                if (digit > 9) digit = digit - 9;
            }
            sum += digit;
            alternate = !alternate;
        }
        
        System.out.println("Card is " + (sum % 10 == 0 ? "valid" : "invalid"));
    }
}
