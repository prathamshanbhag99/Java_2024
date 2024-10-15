package pac1;

interface simplecalc
{
	int add(int a , int b);
	int i=10;
}

class calc implements simplecalc
{
	@Override
	public int add(int a,int b) {
		return a+b;
		
	}	
	
}

public class TC_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calc obj=new calc();
System.out.println("Addition :"+obj.add(10, 10));
	}

}
