package Ques_141_to_150;

// Generate a Binary Clock Visualization

public class ques150 {
    public static void main(String[] args) {
        java.time.LocalTime now = java.time.LocalTime.now();
        printBinaryClock(now.getHour(), now.getMinute(), now.getSecond());
    }
    
    static void printBinaryClock(int h, int m, int s) {
        System.out.println("  H  M  S");
        for (int bit = 3; bit >= 0; bit--) {
            System.out.printf("%d %d %d %d%n",
                (int)Math.pow(2, bit),
                (h >> bit) & 1,
                (m >> bit) & 1,
                (s >> bit) & 1);
        }
    }
}
