package Ques_231_to_240;

// Generate a Pattern of Numbers in a Cross Shape

public class ques233 {
    public static void main(String[] args) {
        int size = 5;
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || i + j == size + 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
              
            System.out.println();
            
        }
    }
}
