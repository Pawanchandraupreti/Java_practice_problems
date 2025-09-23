package Ques_201_to_210;

// Generate a Pattern of Alternating Characters in a Checkerboard

public class ques210 {
    public static void main(String[] args) {
        int size = 8;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
