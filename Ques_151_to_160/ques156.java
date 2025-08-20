package Ques_151_to_160;

import java.util.Random;

// Generate a Random Password with Requirements

public class ques156 {
    public static void main(String[] args) {
        Random rand = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*";
        
        StringBuilder password = new StringBuilder();
        
        // Ensure at least one of each type
        password.append(upper.charAt(rand.nextInt(upper.length())));
        password.append(lower.charAt(rand.nextInt(lower.length())));
        password.append(digits.charAt(rand.nextInt(digits.length())));
        password.append(special.charAt(rand.nextInt(special.length())));
        
        // Fill remaining length
        String all = upper + lower + digits + special;
        for (int i = 4; i < 12; i++) {
            password.append(all.charAt(rand.nextInt(all.length())));
        }
        
        // Shuffle the password
        char[] chars = password.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = rand.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        
        System.out.println("Generated password: " + new String(chars));
    }
}
