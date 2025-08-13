package Ques_121_to_130;

// Generate ASCII Art from String

public class ques126 {
    public static void main(String[] args) {
        String text = "JAVA";
        for (char c : text.toCharArray()) {
            switch (Character.toUpperCase(c)) {
                case 'J': System.out.println("  J  \n J   \nJ    \n JJJ"); break;
                case 'A': System.out.println(" A \nA A\nAAA\nA A"); break;
                case 'V': System.out.println("V   V\n V V \n  V"); break;
                default: System.out.println(c);
            }
            System.out.println();
        }
    }
}
