package pac1;

public class TC_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int res=10/1;
			int[]number= {1,2,3};
			System.out.println(number[1]);
			String text=null;
			System.out.println("The length of the string is : "+text.length());
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("Arithmtic error : "+ e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Arithmtic error : "+ e1.getMessage());
		}
		
		catch(NullPointerException e2)
		{
			System.out.println("Arithmtic error : "+ e2.getMessage());
		}
		
		catch(Exception e3)
		{
			System.out.println("Unexpected error : "+ e3.getMessage());
		}
		
		finally
		{
			System.out.println("This is the finally block");
		}


	}

}

