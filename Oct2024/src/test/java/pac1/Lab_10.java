package pac1;

public class Lab_10 {

    public static void main(String[] args) {
    	
        String input = "PqrS"; 
        
        boolean isPositive = isPositiveString(input);

        
        if (isPositive)
        {
            System.out.println(input + " is a positive string.");
        } else
        {
            System.out.println(input + " is not a positive string.");
        }
    }

    
    public static boolean isPositiveString(String str)
    {
       
        str = str.toUpperCase();

       
        for (int i = 0; i < str.length() - 1; i++)
        {
            
            if (str.charAt(i) > str.charAt(i + 1))
            {
                return false; // 
            }
        }

        return true; 
    }
}
