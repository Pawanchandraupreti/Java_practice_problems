package Ques_131_to_140;

// Calculate Bowling Score

public class ques132 {
    public static void main(String[] args) {
        int[] rolls = {10, 7, 3, 9, 0, 10, 0, 8, 8, 2, 0, 6, 10, 10, 10, 8, 1};
        int score = 0;
        int frameIndex = 0;
        
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[frameIndex] == 10) { // Strike
                score += 10 + rolls[frameIndex+1] + rolls[frameIndex+2];
                frameIndex++;
            } else if (rolls[frameIndex] + rolls[frameIndex+1] == 10) { // Spare
                score += 10 + rolls[frameIndex+2];
                frameIndex += 2;
            } else {
                score += rolls[frameIndex] + rolls[frameIndex+1];
                frameIndex += 2;
            }
        }
        System.out.println("Total score: " + score);
    }
}
