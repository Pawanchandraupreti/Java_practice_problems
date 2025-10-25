package Ques_231_to_240;

// Generate a Word Zigzag Pattern

public class ques231 {
    public static void main(String[] args) {
        String word = "ZIGZAG";
        int height = 3;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < word.length(); j++) {
                int position = j % (2 * (height - 1));
                if (position == i || position == 2 * (height - 1) - i) {
                    System.out.print(word.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
    }
}
