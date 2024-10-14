package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab_12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the firs date (dd/MM/yyyy): ");
        String inputDate1 = scanner.nextLine();
        
        System.out.print("Enter the Second date (dd/MM/yyyy): ");
        String inputDate2 = scanner.nextLine();

      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate FirstDate = LocalDate.parse(inputDate1, formatter);
        LocalDate SecondDate = LocalDate.parse(inputDate2, formatter);

        

        
        Period period = Period.between(FirstDate, SecondDate);

       
        System.out.println("Duration from " + FirstDate + " to " + SecondDate + " is:");
        System.out.println(period.getYears() + " Years, " + period.getMonths() + " Months, and " + period.getDays() + " Days");
        
        scanner.close();
    }
}

