package pac1;


class Base
{
	public void basemethod()
	{
		System.out.println("This is the methid from the base class");
	
	}
}

class Derived extends Base
{
	public void derivedmethod()
	{
		super.basemethod();
		System.out.println("This is the method from the derived class");
	}
}


public class Inheritance 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Derived derived = new Derived();
		derived.derivedmethod();

	}

}
