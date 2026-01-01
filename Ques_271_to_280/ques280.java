
// Generate a Pattern of Perfect Squares
public class ques280 {
    public static void main(String[] args) {
        int rows = 5;
        int count = 0;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                while (!isPerfectSquare(count)) {
                    count++;
                }
                System.out.printf("%4d", count);
                count++;
            }
            System.out.println();
        }
    }
    
    static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
