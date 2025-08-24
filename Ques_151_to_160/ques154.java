package Ques_151_to_160;

// Generate a Multiplication Table Grid

public class ques154 {
    public static void main(String[] args) {
        int size = 5;
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n    " + "====".repeat(size));
        
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
