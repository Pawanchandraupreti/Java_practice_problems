package Ques_211_to_220;

// Generate a Pattern of Numbers in a Pyramid with Spaces

public class ques213 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i));
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
            
        }
    }
}
