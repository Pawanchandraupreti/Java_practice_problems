package Ques_121_to_130;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// Print Calendar Month

public class ques125 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String month = date.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        int year = date.getYear();
        int daysInMonth = date.lengthOfMonth();
        
        System.out.println(month + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        LocalDate firstDay = date.withDayOfMonth(1);
        int startDay = firstDay.getDayOfWeek().getValue() % 7; // Sunday=0
        
        for (int i = 0; i < startDay; i++) System.out.print("   ");
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
    }
}
