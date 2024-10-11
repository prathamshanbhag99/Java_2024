package pac1;

public class TC012_String {

	public static void main(String[] args) {
		String str1 = new String("pooja");
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        
        String str3 = "This is a beautiful day";
        System.out.println("Core " + str3);
        
        System.out.println("Length od str3:" + str3.length());
        
        System.out.println("index of a:" + str3.indexOf("A"));
        
        System.out.println("Substring:" + str3.substring(10, 20));
        
        System.out.println("value of "+ str1);
	}

}

