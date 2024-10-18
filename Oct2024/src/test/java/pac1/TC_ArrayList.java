package pac1;

import java.util.ArrayList;

public class TC_ArrayList {

    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> l1 = new ArrayList<String>();
        
        // Add elements to the ArrayList
        l1.add("Hello");
        l1.add("Hi");
        l1.add("Welcome");
        l1.add("JAVA");
        
        // Print the size of the ArrayList
        System.out.println("Size: " + l1.size());
        
        // Print all elements in the ArrayList
        System.out.println("Elements in the ArrayList: " + l1);
        
        // Remove an element from the ArrayList
        l1.remove("Hi");
        System.out.println("After removing 'Hi': " + l1);
        
        // Check if an element exists in the ArrayList
        if (l1.contains("JAVA")) {
            System.out.println("'JAVA' exists in the list.");
        } else {
            System.out.println("'JAVA' does not exist in the list.");
        }
    }
}
