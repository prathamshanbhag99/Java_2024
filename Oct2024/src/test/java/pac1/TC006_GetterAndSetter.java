package pac1;

public class TC006_GetterAndSetter {
    // Fields
    String name;
    int age;
    String phoneNumber; // New field for phone number

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
    }

    public static void main(String[] args) {
        // Creating object of TC006_GetterAndSetter class
        TC006_GetterAndSetter person = new TC006_GetterAndSetter();
        
        // Setting values using setter methods
        person.setName("Leena");
        person.setAge(25);
        person.setPhoneNumber("9876543210");  // Setting phone number
        
        // Displaying person details
        person.displayDetails();
    }
}
