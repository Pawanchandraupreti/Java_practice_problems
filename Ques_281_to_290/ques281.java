package Ques_281_to_290;

// Generate a Word Wave Pattern (Vertical)

public class ques281 {
    public static void main(String[] args) {
        String word = "WAVES";
        int amplitude = 3;
        
        for (int i = -amplitude; i <= amplitude; i++) {
            for (int j = 0; j < word.length(); j++) {
                int waveHeight = (int)(amplitude * Math.sin(j));
                if (waveHeight == i) {
                    System.out.print(word.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
