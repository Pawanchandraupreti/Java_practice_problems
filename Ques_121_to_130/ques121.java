package Ques_121_to_130;

import java.time.LocalDate;
import java.time.Period;

// Calculate Age from Birthdate

public class ques121 {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1990, 5, 15);
        LocalDate today = LocalDate.now();
        
        Period age = Period.between(birthdate, today);
        System.out.printf("Age: %d years, %d months, %d days", 
                         age.getYears(), age.getMonths(), age.getDays());
    }
}
