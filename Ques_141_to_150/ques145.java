package Ques_141_to_150;

// Create a Simple Tic-Tac-Toe Board

public class ques145 {
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'X'}
        };
        
        System.out.println(" ═══╬═══╬═══");
        for (char[] row : board) {
            System.out.print(" ");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length-1) System.out.print(" ║ ");
            }
            System.out.println("\n ═══╬═══╬═══");
        }
    }
}
