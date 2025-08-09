package Ques_101_to_110;

// Count Character Occurrences

public class ques108 {
    public static void main(String[] args) {
        String text = "programming";
        char target = 'm';
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == target) count++;
        }
        System.out.println(target + " appears " + count + " times");
    }
}
