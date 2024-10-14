package pac1;

import java.util.HashSet;
import java.util.Scanner;

public class Lab_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.println("Choose an operation:");
        System.out.println("1: Add the String to itself");
        System.out.println("2: Replace odd positions with #");
        System.out.println("3: Remove duplicate characters");
        System.out.println("4: Change odd characters to uppercase");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        // Perform the chosen operation
        String result = performStringOperation(inputString, choice);
        System.out.println("Result: " + result);
    }

    public static String performStringOperation(String str, int choice) {
        switch (choice) {
            case 1: // Add the String to itself
                return str + str;
                
            case 2: // Replace odd positions with '#'
                StringBuilder replaced = new StringBuilder(str);
                for (int i = 1; i < str.length(); i += 2) {
                    replaced.setCharAt(i, '#');
                }
                return replaced.toString();
                
            case 3: // Remove duplicate characters
                StringBuilder noDuplicates = new StringBuilder();
                HashSet<Character> seen = new HashSet<>();
                for (char c : str.toCharArray()) {
                    if (!seen.contains(c)) {
                        seen.add(c);
                        noDuplicates.append(c);
                    }
                }
                return noDuplicates.toString();
                
            case 4: // Change odd characters to uppercase
                StringBuilder uppercased = new StringBuilder(str);
                for (int i = 1; i < str.length(); i += 2) {
                    uppercased.setCharAt(i, Character.toUpperCase(uppercased.charAt(i)));
                }
                return uppercased.toString();
                
            default:
                return "Invalid choice!";
        }
    }
}
