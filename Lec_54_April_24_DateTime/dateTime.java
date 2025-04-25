package Lec_54_April_24_DateTime;
import java.time.*;

public class dateTime {
    public static void main(String[] args) {
        
        // Getting curent date, time
        LocalDate currDate = LocalDate.now();
        LocalTime currTime = LocalTime.now();
        LocalDateTime currDateTime = LocalDateTime.now();

        // Custom date and Time
        LocalDate customDate = LocalDate.of(2011, 04, 02);
        LocalTime customTime = LocalTime.of(23, 30);
        LocalDateTime customDateTime = LocalDateTime.of(2020,12,02,13,24);

        // Comparing date and Time - isBefore() / isAfter()
        System.out.println(customDate.isBefore(currDate));
        System.out.println(customTime.isAfter(currTime));
        System.out.println(customDateTime.isBefore(currDateTime));

        // date and time after or before some day/hours from current date
        LocalDate prevDate = LocalDate.now().minusDays(125);
        LocalDate nextDate = LocalDate.now().plusDays(125);
        LocalDate randomDate = LocalDate.now().minusWeeks(11);
        LocalDateTime randomDateTime = LocalDateTime.now().plusMinutes(12345);

        // getting day, month, hour etc from date or time
        // methods will be same for all depends if we can extract date or time from them
        int day = prevDate.getDayOfMonth();
        Month month = currDate.getMonth();
        int month_int = currDate.getMonthValue();
        int year = currDateTime.getYear();
        int hour = currTime.getHour();

        // Conversion from DateTime to Date or Time
        randomDate = randomDateTime.toLocalDate();
        LocalTime randomTime = randomDateTime.toLocalTime();

        // ZonedDateTime
        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zoneDateTime);
        System.out.println(londonTime);

        // For ZoneDateTime methods are also same
        // for comparing with other zonedatetime or 
        // for extracting day, month, year, hour, minute etc
        System.out.println(zoneDateTime.isBefore(londonTime));
        int d = zoneDateTime.getDayOfMonth();
        randomDate = zoneDateTime.toLocalDate();
    }
}
