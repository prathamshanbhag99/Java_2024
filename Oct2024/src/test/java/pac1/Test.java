package pac1;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the date of Purchase (dd/MM/yyyy): ");
        String Purchase = scanner.nextLine();
       
      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate purchase = LocalDate.parse(Purchase, formatter);
        
        
        int Duration = 0;
        System.out.print("Enter the duration of the Warranty in terms of Months : ");
        Duration = scanner.nextInt();
        
        System.out.println("Warranty End On : " + purchase.plusMonths(Duration));
       
        scanner.close();
    }
}

