package pac1;

public class TC015_Overloading 
{
	TC015_Overloading()
	{
		System.out.println("Constructor without parameter");
	}
	
	TC015_Overloading(int value)
	{
		System.out.println("Constructor with parameter : "+value);
		
	}
	
	public static void main(String[] args) 
	{
		TC015_Overloading obj=new TC015_Overloading();
		TC015_Overloading obj1=new TC015_Overloading(5000);
	}


}
