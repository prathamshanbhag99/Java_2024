package pac1;

import java.io.*;
public class TC_OwnException {
	
	void proc()
	{
		
		try
		{
			throw new FileNotFoundException("From Exception");
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Caught from the demo");
		}
		
	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	TC_OwnException obj = new TC_OwnException();
	obj.proc();
	
	}

}
