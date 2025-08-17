package Ques_141_to_150;

// Generate a Number Spiral

public class ques141 {
    public static void main(String[] args) {
        int size = 5;
        int[][] spiral = new int[size][size];
        int value = 1;
        int minRow = 0, maxRow = size-1, minCol = 0, maxCol = size-1;
        
        while (value <= size*size) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            for (int i = minRow+1; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            for (int i = maxCol-1; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            for (int i = maxRow-1; i > minRow; i--) {
                spiral[i][minCol] = value++;
            }
            minRow++; minCol++; maxRow--; maxCol--;
        }
        
        // Print spiral
        for (int[] row : spiral) {
            for (int num : row) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }
    }
}
