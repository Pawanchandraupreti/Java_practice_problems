package Ques_151_to_160;

// Generate a Password Strength Checker

public class ques151 {
    public static void main(String[] args) {
        String password = "Secure123!";
        int strength = 0;
        
        if (password.length() >= 8) strength++;
        if (password.matches(".*[A-Z].*")) strength++;
        if (password.matches(".*[a-z].*")) strength++;
        if (password.matches(".*[0-9].*")) strength++;
        if (password.matches(".*[!@#$%^&*].*")) strength++;
        
        String[] levels = {"Very Weak", "Weak", "Medium", "Strong", "Very Strong"};
        System.out.println("Password strength: " + levels[strength-1]);
    }
}
