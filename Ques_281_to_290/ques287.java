package Ques_281_to_290;

// Generate a Pattern of Numbers in a Reverse Right Triangle

public class ques287 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}