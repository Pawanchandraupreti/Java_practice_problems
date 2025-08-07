package Ques_101_to_110;

// Check Leap Year

public class ques103 {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 400 == 0) || 
                        (year % 100 != 0 && year % 4 == 0);
        
        System.out.println(year + " is " + 
                         (isLeap ? "" : "not ") + "a leap year");
    }
}
