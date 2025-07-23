package Ques_31_to_40;

//Basic Exception Handling

public class ques34 {
    public static void validateVotingAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote!");
        }
        System.out.println("You can vote!");
    }

    public static void main(String[] args) {
        try {
            validateVotingAge(20);
            validateVotingAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
