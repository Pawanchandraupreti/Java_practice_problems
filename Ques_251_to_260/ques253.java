package Ques_251_to_260;

// Generate a Pattern of Numbers in a Heart Shape

public class ques253 {
    public static void main(String[] args) {
        int size = 6;
        
        for (int i = size / 2; i <= size; i += 2) {
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        for (int i = size; i >= 1; i--) {
            System.out.print(" ".repeat(size - i));
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j % 10);
            }
            System.out.println();
        }
    }
}
