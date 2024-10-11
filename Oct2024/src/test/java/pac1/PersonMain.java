package pac1;

import java.util.*;
 
public class PersonMain {
	private String FirstName;
	private String LastName;
	private char Gender;
	private long phoneNo;
	
	public long getPhoneNo() {
		return phoneNo;
	}
 
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
 
	private void setFirstName(String FirstName) {
		this.FirstName=FirstName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	private void setLastName(String LastName) {
		this.LastName=LastName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	private void setGender(char Gender) {
		this.Gender=Gender;
	}
	
	public char getGender() {
		return Gender;
	}
	
	public void display(String FirstName,String LastName,char Gender,long Phone) {
		System.out.print("FirstName:"+FirstName+'\n'+"LastName:"+LastName+'\n'+"Gender:"+Gender+'\n'+"Phone:"+Phone);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PersonMain person=new PersonMain();
		String fname=sc.nextLine();
		String lname=sc.nextLine();
		char g=sc.next().charAt(0);
		long ph=sc.nextLong();
		person.setFirstName("Ashwin");
		String FirstName=person.getFirstName();
		person.setLastName("Murugan");
		String LastName=person.getLastName();
		person.setGender('M');
		char Gender=person.getGender();
		person.setPhoneNo(ph);
		long Phone=person.getPhoneNo();
		person.display(FirstName,LastName,Gender,Phone);
	}
 
}

 
