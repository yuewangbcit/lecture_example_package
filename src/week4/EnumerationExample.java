package src.week4;

/**
 * The EnumerationExample program defines an enumerated type for days in a week.
 *
 * @author Yue Wang
 * @version Jan 22, 2023
 */
public class EnumerationExample {
    // create a enumerated data type for seven days in a week
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    // instance variable of the EnumerationExample class
    Day day;

    // constructor of the EnumTest class
    public EnumerationExample(Day day) {
        this.day = day;
    }

    // use a switch block to print a message for each day
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        // create EnumerationExample objects using the enumerated data type for days
        EnumerationExample firstDay = new EnumerationExample(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumerationExample secondDay = new EnumerationExample(Day.TUESDAY);
        secondDay.tellItLikeItIs();
        EnumerationExample thirdDay = new EnumerationExample(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumerationExample fourthDay = new EnumerationExample(Day.THURSDAY);
        fourthDay.tellItLikeItIs();
        EnumerationExample fifthDay = new EnumerationExample(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumerationExample sixthDay = new EnumerationExample(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumerationExample seventhDay = new EnumerationExample(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

        // Print the ordinal number of SUNDAY in Day
        System.out.println(Day.FRIDAY.ordinal());
    }
}
