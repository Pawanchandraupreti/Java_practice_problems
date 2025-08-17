package Ques_141_to_150;

// Calculate Digital Clock Angles

public class ques143 {
    public static void main(String[] args) {
        int hours = 3;
        int minutes = 30;
        
        double hourAngle = (hours % 12) * 30 + minutes * 0.5;
        double minuteAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        
        System.out.printf("Angle at %02d:%02d: %.1f degrees%n", 
                         hours, minutes, Math.min(angle, 360-angle));
    }
}
