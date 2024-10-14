package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab_11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();

      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate enteredDate = LocalDate.parse(inputDate, formatter);

        LocalDate currentDate = LocalDate.now();

        
        Period period = Period.between(enteredDate, currentDate);

       
        System.out.println("Duration from " + enteredDate + " to " + currentDate + " is:");
        System.out.println(period.getYears() + " Years, " + period.getMonths() + " Months, and " + period.getDays() + " Days");
        
        scanner.close();
    }
}

