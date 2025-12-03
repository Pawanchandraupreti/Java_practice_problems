package Ques_261_to_270;

// Generate a Pattern of Numbers in a Pyramid with Alternating Colors

public class ques263 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i));
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}


