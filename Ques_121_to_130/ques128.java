package Ques_121_to_130;

// Calculate Digital Root (Recursive Sum of Digits)

public class ques128 {
    public static void main(String[] args) {
        int number = 493193;
        while (number > 9) {
            number = String.valueOf(number)
                          .chars()
                          .map(Character::getNumericValue)
                          .sum();
        }
        System.out.println("Digital root: " + number);
    }
}
