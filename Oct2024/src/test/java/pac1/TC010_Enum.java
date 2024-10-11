package pac1;

import org.openqa.selenium.support.Colors;

public class TC010_Enum {
	enum colors
	{
		RED,BLUE,GREEN;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		colors col=colors.GREEN;
		System.out.println("The color is :"+ col);
	}

}
