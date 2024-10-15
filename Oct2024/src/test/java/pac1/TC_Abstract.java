package pac1;


abstract class Shape
{
	abstract void draw();
	
	abstract void paint();
	
	
}

class rect extends Shape
{

	@Override
	void draw()
	{
		System.out.println("Rectangle");
	}

	@Override
	void paint() {
		// TODO Auto-generated method stub
		System.out.println("Paint");
	}
}




public class TC_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape r1=new rect();
       r1.draw();
       r1.paint();
	}

}
