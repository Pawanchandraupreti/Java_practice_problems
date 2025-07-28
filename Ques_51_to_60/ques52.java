package Ques_51_to_60;

//Enum with Switch Case

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


public class ques52 {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        
        switch(today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Weekday");
        }
    }
}
