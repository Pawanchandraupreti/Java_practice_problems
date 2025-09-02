package Ques_161_to_170;

// Generate a Pascal's Triangle

public class ques166 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.print(" ".repeat(rows - i));
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
