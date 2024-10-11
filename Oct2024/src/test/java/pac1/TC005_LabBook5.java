
package pac1;

import java.util.Scanner;

public class TC005_LabBook5 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        num = sc.nextInt();  // Read an integer input
        
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close(); // Close the scanner to prevent resource leakage
    }
}
