package Ques_141_to_150;

// Simulate a Digital Countdown Timer

public class ques149 {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 10;
        
        while (seconds >= 0) {
            System.out.printf("\rCountdown: %02d", seconds);
            Thread.sleep(1000);
            seconds--;
        }
        System.out.println("\nTime's up!");
    }
}
