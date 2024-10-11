package pac1;

public class TC007_Constructors {
	int xcor;
	int ycor;
	TC007_Constructors(int a,int b)
	{
		this.xcor=a;
		this.ycor=b;
	
	}
	public void add()
	{
		System.out.println("Addition :"+(xcor+ycor));
	}
}
