package pac1;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
 
public class TC_Throws {
	static void fileopen1() throws FileNotFoundException
	{
		System.out.println("Inside the method");
		FileReader fd=new FileReader("text.txt");
	}
    public static void main(String args[])
    {
         try {
    		 fileopen1();
    	 }
    	 catch(FileNotFoundException e)
    	 {
    		 System.out.println(e.getMessage());
    	 }
     }
}