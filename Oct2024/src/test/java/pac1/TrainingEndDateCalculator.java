package pac1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TrainingEndDateCalculator {

    public static void main(String[] args) {
        // Start date of training
        LocalDate startDate = LocalDate.of(2024, 9, 25);
        int trainingDays = 50;
        
        // Print start date of training
        System.out.println("Start date of training: " + startDate);
        
        // Calculate the end date excluding weekends
        LocalDate endDate = calculateEndDate(startDate, trainingDays);

        // Print the calculated end date
        System.out.println("End date of training (excluding weekends): " + endDate);
    }

    // Method to calculate end date excluding Saturdays and Sundays
    public static LocalDate calculateEndDate(LocalDate startDate, int trainingDays) {
        LocalDate currentDate = startDate;
        int workingDaysAdded = 0;

        // Loop until we've added the required number of working days
        while (workingDaysAdded < trainingDays) {
            // Move to the next day
            currentDate = currentDate.plusDays(1);

            // If it's not Saturday or Sunday, count it as a working day
            if (!(currentDate.getDayOfWeek() == DayOfWeek.SATURDAY || currentDate.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                workingDaysAdded++;
            }
        }
        return currentDate;
    }
}
