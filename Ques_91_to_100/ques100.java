package Ques_91_to_100;

// Convert Seconds to HH:MM:SS

public class ques100 {
    public static void main(String[] args) {
        int totalSeconds = 4525;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
