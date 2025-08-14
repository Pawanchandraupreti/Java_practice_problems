package Ques_131_to_140;

// Create a Magic Square Validator

public class ques133 {
    public static void main(String[] args) {
        int[][] square = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        
        int magicConstant = 15; // For 3x3 square
        boolean isMagic = true;
        
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += square[i][j];
                colSum += square[j][i];
            }
            if (rowSum != magicConstant || colSum != magicConstant) {
                isMagic = false;
                break;
            }
        }
        
        System.out.println("Is magic square? " + isMagic);
    }
}
