package Ques_131_to_140;

import java.util.Random;

// Create a Word Search Grid

public class ques138 {
    public static void main(String[] args) {
        int size = 10;
        char[][] grid = new char[size][size];
        Random rand = new Random();
        
        // Fill with random letters
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = (char)(rand.nextInt(26) + 'A');
            }
        }
        // Insert hidden word diagonally
        String word = "JAVA";
        for (int i = 0; i < word.length(); i++) {
            grid[i][i] = word.charAt(i);
        }
        
        // Print grid
        for (char[] row : grid) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
