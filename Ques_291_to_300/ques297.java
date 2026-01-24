package Ques_291_to_300;

// Generate a Pattern of Numbers in a Pascal's Triangle (Alternate)

public class ques297 {
    public static void main(String[] args) {
        int rows = 6;
        
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.print(" ".repeat(rows - i - 1));
            
            for (int j = 0; j <= i; j++) {
                if (number % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(number + " ");
                }
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
