package Ques_51_to_60;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

// Date and Time Formatting

public class ques60 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        System.out.println("Formatted: " + now.format(formatter));
        System.out.println("Day of week: " + now.getDayOfWeek());
        
        LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
        System.out.println("Next birthday: " + birthday.withYear(now.getYear()));
    }
}
