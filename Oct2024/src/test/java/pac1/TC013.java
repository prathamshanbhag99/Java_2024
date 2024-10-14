package pac1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TC013 {

    public static void main(String[] args) {
        // Get the current time as an Instant
        Instant CurrentTime = Instant.now();

        // Date formatter for displaying dates in a localized long format
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        // Get the current date as a LocalDate
        LocalDate now = LocalDate.now();
        
        // Display the formatted current date
        System.out.println("Formatter: " + now.format(formatter));

        // Display various date-related information
        System.out.println("Current time is: " + CurrentTime);
        System.out.println("Today: " + now);
        System.out.println("Tomorrow: " + now.plusDays(1));
        System.out.println("Yesterday: " + now.minusDays(1));
        System.out.println("Last month: " + now.minusMonths(1));
        System.out.println("Is leap year?: " + now.isLeapYear());
        System.out.println("Move to 30th day of the month: " + now.withDayOfMonth(30));
        System.out.println("Training end date: " + now.plusDays(48));

        // Get the current ZonedDateTime
        ZonedDateTime CT = ZonedDateTime.now();
        System.out.println("CT :" + CT);

        // Get the current ZonedDateTime for Paris
        ZonedDateTime CT_Paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("CT_PARIS :" + CT_Paris);

        // Display various date manipulations for the Paris time zone
        System.out.println("Tomorrow _Paris: " + CT_Paris.plusDays(1));
        System.out.println("Yesterday_Paris: " + CT_Paris.minusDays(1));
        System.out.println("Last month_Paris: " + CT_Paris.minusMonths(1));
        System.out.println("Move to 30th day of the month in PARIS: " + CT_Paris.withDayOfMonth(30));
        System.out.println("Training end date_Paris: " + CT_Paris.plusDays(48));

        // Calculate the period between India's Independence Day and today
        LocalDate start = LocalDate.of(1947, Month.AUGUST, 15);
        LocalDate end = LocalDate.now();
        Period period = Period.between(start, end);
        
        // Display the number of years, months, and days of independence
        System.out.println("Number of years of Independence: " + period.getYears());
        System.out.println("Number of days of Independence: " + period.getDays());
        System.out.println("Number of months of Independence: " + period.getMonths());
    }
}
