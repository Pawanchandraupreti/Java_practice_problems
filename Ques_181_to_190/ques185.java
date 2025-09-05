package Ques_181_to_190;

// Create a Simple Text-Based Timer with Beep

public class ques185 {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 5;
        
        for (int i = seconds; i > 0; i--) {
            System.out.printf("\rTime remaining: %d seconds", i);
            Thread.sleep(1000);
        }
        
        
        System.out.println("\rTime's up! \u0007"); // \u0007 is the bell character
    }
}
