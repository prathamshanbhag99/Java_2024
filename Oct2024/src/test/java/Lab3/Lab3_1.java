package Lab3;

import java.util.Scanner;

// Custom exception for blank first or last name
class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

enum Gender {
    MALE, FEMALE;
}
public class Lab3_1 {
    private String firstName;
    private String lastName;
    private Gender gender;
    private long phoneNo;

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setFirstName(String firstName) throws NameException {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new NameException("First Name cannot be blank");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) throws NameException {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new NameException("Last Name cannot be blank");
        }
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void display() {
        System.out.println("Person Details:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Phone: " + getPhoneNo());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lab3_1 person = new Lab3_1();

        try {
           
            System.out.print("Enter First Name: ");
            String fname = sc.nextLine();
            person.setFirstName(fname);

            System.out.print("Enter Last Name: ");
            String lname = sc.nextLine();
            person.setLastName(lname);

           
            Gender gender = null;
            while (gender == null) {
                System.out.print("Enter Gender (M/F): ");
                char g = sc.next().charAt(0);
                if (g == 'M' || g == 'm') {
                    gender = Gender.MALE;
                } else if (g == 'F' || g == 'f') {
                    gender = Gender.FEMALE;
                } else {
                    System.out.println("Invalid input. Please enter 'M' for Male or 'F' for Female.");
                }
            }
            person.setGender(gender);

            // Input phone number
            System.out.print("Enter Phone Number: ");
            long ph = sc.nextLong();
            person.setPhoneNo(ph);

            // Display person details
            person.display();
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }
    }
}
