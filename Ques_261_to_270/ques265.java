package Ques_261_to_270;

import java.util.Random;

// Create a Simple Text-Based Random Password Strength Tester

public class ques265 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] weakPasswords = {"123456", "password", "qwerty", "letmein"};
        String[] strongPasswords = {"P@ssw0rd!", "Str0ngP@ss!", "S3cur3P@ss!", "C0mpl3x!23"};
        
        String testPassword = rand.nextBoolean() ? 
            weakPasswords[rand.nextInt(weakPasswords.length)] :
            strongPasswords[rand.nextInt(strongPasswords.length)];
        
        System.out.println("Testing password: " + testPassword);
        
        int strength = 0;
        if (testPassword.length() >= 8) strength++;
        if (testPassword.matches(".*[A-Z].*")) strength++;
        if (testPassword.matches(".*[a-z].*")) strength++;
        if (testPassword.matches(".*[0-9].*")) strength++;
        if (testPassword.matches(".*[!@#$%^&*].*")) strength++;
        
        String[] levels = {"Very Weak", "Weak", "Fair", "Strong", "Very Strong"};
        System.out.println("Password strength: " + levels[strength]);
    }
}
