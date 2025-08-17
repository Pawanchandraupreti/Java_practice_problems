package Ques_141_to_150;

// Generate a Text-Based Sine Wave

public class ques144 {
    public static void main(String[] args) {
        int width = 60;
        int height = 10;
        
        for (int y = height; y >= -height; y--) {
            for (int x = 0; x < width; x++) {
                double radians = x * Math.PI / 8;
                int waveY = (int)(Math.sin(radians) * height);
                System.out.print(waveY == y ? "*" : " ");
            }
            System.out.println();
        }
    }
}
