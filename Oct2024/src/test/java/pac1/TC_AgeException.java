package pac1;

import java.util.Scanner;

//Custom exception class for AgeException
class AgeException extends Exception {
 private int age;

 // Constructor to initialize the age
 AgeException(int a) {
     age = a;
 }

 // Overriding the toString() method to display a custom message
 public String toString() {
     return age + " is an invalid age. Age must be 16 or above.";
 }
}

//Employee class to get user details
class Emp {
 String name;
 int age;

 // Method to get employee details
 void getDetails() throws AgeException {
     Scanner sc = new Scanner(System.in);

     // Getting name input
     System.out.println("Enter your name:");
     name = sc.nextLine();

     // Getting age input
     System.out.println("Enter your age:");
     age = sc.nextInt();

     // Validating age and throwing the custom exception if age < 16
     if (age < 16) {
         throw new AgeException(age);
     }
 }

 // Method to display employee details
 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Main class to test the exception handling
public class TC_AgeException {
 public static void main(String[] args) {
     Emp emp = new Emp();

     try {
         // Getting employee details
         emp.getDetails();
         
         // Displaying employee details if no exception is thrown
         emp.displayDetails();
     } catch (AgeException e) {
         // Catching and printing the custom exception
         System.out.println(e);
     }
 }
}
