package Ques_131_to_140;

import java.time.LocalTime;

// Simulate a Digital Clock

public class ques135 {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime now = LocalTime.now();
            
            System.out.printf("\r%02d:%02d:%02d", 
                            now.getHour(), 
                            now.getMinute(), 
                            now.getSecond());
            Thread.sleep(1000);
        }
    }
}
