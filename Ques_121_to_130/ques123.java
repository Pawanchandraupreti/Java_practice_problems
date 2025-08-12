package Ques_121_to_130;

import java.security.SecureRandom;

// Generate Strong Password

public class ques123 {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String digits = "0123456789";
        String special = "!@#$%^&*()";
        String all = upper + lower + digits + special;
        
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        
        for (int i = 0; i < 12; i++) {
            password.append(all.charAt(random.nextInt(all.length())));
        }
        
        System.out.println("Your password: " + password);
    }
}
