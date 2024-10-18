package Lab3;


import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

enum Gender {
    MALE, FEMALE;
}

// Class for Person
class Person1 {
    private String name;
    private float age;

    public Person1(String name, float age) throws AgeException {
        if (age >14) {
            throw new AgeException("Age must be above 15.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", Age: " + age + "]";
    }
}


class Account1 {
    private long accNum;
    private double balance;
    private Person1 accHolder;

    private static final double MIN_BALANCE = 500;

    public Account1(long accNum, double balance, Person1 accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public long getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else if (balance - amount < MIN_BALANCE) {
            System.out.println("Cannot withdraw. Minimum balance of " + MIN_BALANCE + " should be maintained.");
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    @Override
    public String toString() {
        return "Account : A/C No = " + accNum + ", Balance = " + balance + ", Details = " + accHolder;
    }
}


public class Lab3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter First Name: ");
            String fname = sc.nextLine();

            System.out.print("Enter Age: ");
            float age = sc.nextFloat();
            sc.nextLine(); 
            
            Person1 person = new Person1(fname, age);

           
            Account1 account = new Account1(1001, 2000, person);
            account.deposit(2000);
            account.withdraw(1000);

            System.out.println("Account details:");
            System.out.println(account);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
