package pac1;

class box
{
 static double dblwidth =10;
 static double dblheight=30;
 static double dbldepth=4;
 int boxid;
	
	public static double calvolume()
	{
		double doutemp = 0;
		doutemp = dblwidth * dblheight * dbldepth;
		System.out.print(doutemp);
		return doutemp;
	}
	
}

public class TC001_ClassandObjects {


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		box box1=new box();
		box1.calvolume();
	}
}
