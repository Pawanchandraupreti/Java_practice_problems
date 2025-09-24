package Ques_201_to_210;

// Generate a Pattern of Numbers in Reverse Order

public class ques207 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
