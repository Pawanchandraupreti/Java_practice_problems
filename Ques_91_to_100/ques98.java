package Ques_91_to_100;

// Validate Email Format

public class ques98 {
    public static void main(String[] args) {
        String email = "test@example.com";
        boolean isValid = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        
        System.out.println(email + " is " + (isValid ? "valid" : "invalid"));
    }
}
