package Ques_171_to_180;

// Generate a Pattern of Alternating Letters

public class ques177 {
    public static void main(String[] args) {
        int size = 5;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    
                    System.out.print("A ");
                    
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}
