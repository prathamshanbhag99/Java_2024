package pac1;

class Person1 {
    private String name;
    private float age;

    public Person1(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [Name : " + name + ", Age :" + age + "]";
    }
}


class Account1 {
    private long accNum;
    private double balance;
    private Person1 accHolder;

    public Account1(long accNum, double balance, Person1 accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person1 getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person1 accHolder) {
        this.accHolder = accHolder;
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
        if (amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    
    public String toString() {
        return "Account : A/C No =" + accNum + ", Balance=" + balance + ", Details =" + accHolder + "]";
    }
}


class SavingsAccount extends Account1 {
    private final double MINIMUM_BALANCE = 1000;

    public SavingsAccount(long accNum, double balance, Person1 accHolder)
    {
        super(accNum, balance, accHolder);
    }

    
    public void withdraw(double amount) {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of INR " + MINIMUM_BALANCE + " must be maintained.");
        }
    }
}


class CurrentAccount extends Account1 {
    private double overdraftLimit;

    public CurrentAccount(long accNum, double balance, Person1 accHolder, double overdraftLimit) {
        super(accNum, balance, accHolder);
        this.overdraftLimit = overdraftLimit;
    }

    
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
            
        } 
        
        else 
        {
            System.out.println("Cannot withdraw. Overdraft limit of INR " + overdraftLimit + " exceeded.");
        }
    }

    public boolean isOverdraftLimitReached() {
        return getBalance() < -overdraftLimit;
    }
}


public class Lab2_2 {
    public static void main(String[] args) {
        Person1 smith = new Person1("Smith", 30);
        Person1 kathy = new Person1("Kathy", 25);

        
        SavingsAccount smithSavings = new SavingsAccount(1001, 2000, smith);
        CurrentAccount kathyCurrent = new CurrentAccount(1002, 3000, kathy, 50000);

        
        smithSavings.deposit(2000); 
        smithSavings.withdraw(2500);
        smithSavings.withdraw(500); 
        smithSavings.withdraw(2500);

        kathyCurrent.deposit(1000); 
        kathyCurrent.withdraw(3500); 
        kathyCurrent.withdraw(200); 
        kathyCurrent.withdraw(50000); 
        kathyCurrent.withdraw(50000); 
       
        System.out.println("Smith's account balance: " + smithSavings.getBalance());
        System.out.println("Kathy's account balance: " + kathyCurrent.getBalance());

       
        System.out.println(smithSavings);
        System.out.println(kathyCurrent);
    }
}
