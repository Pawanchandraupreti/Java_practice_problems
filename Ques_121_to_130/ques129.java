package Ques_121_to_130;

// Create Diamond Pattern with Letters

public class ques129 {
    public static void main(String[] args) {
        char maxChar = 'E';
        
        // Upper half
        for (char c = 'A'; c <= maxChar; c++) {
            printLine(c, maxChar);
        }
        
        // Lower half
        for (char c = (char)(maxChar - 1); c >= 'A'; c--) {
            printLine(c, maxChar);
        }
    }
    
    static void printLine(char current, char max) {
        int spaces = max - current;
        System.out.print(" ".repeat(spaces));
        
        for (char c = 'A'; c < current; c++) {
            System.out.print(c);
        }
        
        for (char c = current; c >= 'A'; c--) {
            System.out.print(c);
        }
        
        System.out.println();
    }
}
