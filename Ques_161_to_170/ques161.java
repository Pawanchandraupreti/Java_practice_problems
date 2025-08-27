package Ques_161_to_170;

// Generate a Christmas Tree Pattern

public class ques161 {
    public static void main(String[] args) {
        int height = 6;
        for (int i = 0; i < height; i++) {
            System.out.print(" ".repeat(height - i - 1));
            System.out.println("*".repeat(2 * i + 1));
        }
        
        // Trunk
        System.out.print(" ".repeat(height - 2));
        System.out.println("|||");
    }
}
