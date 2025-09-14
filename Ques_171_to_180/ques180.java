package Ques_171_to_180;

// Generate a Multiplication Table with Formatting

public class ques180 {
    public static void main(String[] args) {
        int size = 5;
        
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        
        
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.print("----");
        }
        System.out.println();
        
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
