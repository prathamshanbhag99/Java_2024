package pac1;


class Person
{
	private String name;
	private float age;
	
	public Person(String name , float age)
	{
		this.name =name;
		this.age = age ;
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
	
	public String toString() 
	{
		return "Person [name ="+name + ", age "+ age + "]";
	}
	
}



class Account
{
    private long accNum;
    private double balance;
    private Person accHolder;

    
    private static final double MIN_BALANCE = 500;

    
    public Account(long accNum, double balance, Person accHolder)
    {
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

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    
    public void deposit(double amount) {
        if (amount > 0)
        {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } 
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else if (balance - amount < MIN_BALANCE) {
            System.out.println("Cannot withdraw. Minimum balance of INR " + MIN_BALANCE + " should be maintained.");
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    @Override
    public String toString() {
        return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
    }
}


public class Lab2_1 {

	public static void main(String[] args) {
		
		 Person smith = new Person("Smith", 30);
	        Person kathy = new Person("Kathy", 25);

	        
	        Account smithAccount = new Account(1001, 2000, smith);
	        Account kathyAccount = new Account(1002, 3000, kathy);

	        
	        smithAccount.deposit(2000);

	        
	        kathyAccount.withdraw(2000);

	        System.out.println("Smith's account balance: " + smithAccount.getBalance());
	        System.out.println("Kathy's account balance: " + kathyAccount.getBalance());

	        
	        System.out.println(smithAccount);
	        System.out.println(kathyAccount);
	    

	}

}
