package Ques_221_to_230;

// Generate a Pattern of Numbers in a Right-Aligned Triangle

public class ques227 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            
            
        }
    }
}
