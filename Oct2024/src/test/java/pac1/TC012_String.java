package pac1;

public class TC012_String {

	public static void main(String[] args) {
		String str1 = new String("pooja");
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        
        String str3 = "This is a beautiful day";
        System.out.println("Core "
        		+ "" + str3);
        
        System.out.println("Length od str3:" + str3.length());
        
        System.out.println("index of a:" + str3.indexOf("A"));
        
        System.out.println("Substring:" + str3.substring(10, 20));
        
        System.out.println("Value of: " + str1.valueOf(30));
        System.out.println("Empty: " + str2.isEmpty());

        System.out.println(str1.concat(str3));
        System.out.println(str1.equals(str3));

        StringBuffer str4 = new StringBuffer("apple");
        System.out.println("String buffer: " + str4.append(str4));
        
        System.out.println("String buffer: " + str4.reverse());
        
        StringBuilder str5=new StringBuilder("orange");
        
        System.out.println("String Builder : " + str5.reverse());
        
	}

}

