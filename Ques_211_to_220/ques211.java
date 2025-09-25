package Ques_211_to_220;

// Generate a Word Wave Pattern

public class ques211 {
    public static void main(String[] args) {
        String word = "WAVE";
        int height = 3;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (j % height == i) {
                    System.out.print(word.charAt(j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
