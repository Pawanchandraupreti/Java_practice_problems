
// Find the Minimum and Maximum in an Array Without Sorting
public class ques276 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 67};
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Range: " + (max - min));
    }
}