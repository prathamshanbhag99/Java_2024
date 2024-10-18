package pac1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_Regex {

    public static void main(String[] args) {
        // Exact string match
        String inputStr = "Apple";
        String pattern = "Apple";
        boolean patternMatch = Pattern.matches(pattern, inputStr);
        System.out.println("Exact match: " + patternMatch);
        
        // Substring match
        String input = "Welcome Santosh";
        Pattern p1 = Pattern.compile("Santosh");
        Matcher m1 = p1.matcher(input);
        System.out.println("Substring match: " + m1.matches());  // Checks full string match
        
        while (m1.find()) {
            System.out.println(m1.group() + ":" + m1.start() + ":" + m1.end());
        }

        // Match word starting with uppercase and ending with a digit
        String input1 = "Exol23";
        Pattern p2 = Pattern.compile("^[A-Z].*[0-9]$");
        Matcher m2 = p2.matcher(input1);
        
        if (m2.find()) {
            System.out.println("String Found");
        } else {
            System.out.println("String Not Found");
        }

        // Email validation
        
        String email = "prathamshanbhag9h9@gmail.com";
        Pattern p3 = Pattern.compile("^[\\w._]+@[\\w]+\\.[\\w.]{2,6}$");
        Matcher m3 = p3.matcher(email);
        
        if (m3.find()) {
            System.out.println("Valid Email ID");
        } else {
            System.out.println("Invalid Email ID");
        }

        // Mobile number validation 
        String mobile = "9134234145";
        Pattern p4 = Pattern.compile("^\\d{10}$");
        Matcher m4 = p4.matcher(mobile);
        
        if (m4.find()) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Non-digit pattern match (10 non-digit characters)
        String nonDigitStr = "asdfghjklo";
        Pattern p5 = Pattern.compile("\\D{10}");
        Matcher m5 = p5.matcher(nonDigitStr);
        
        if (m5.find()) {
            System.out.println("Non-digit pattern found");
        } else {
            System.out.println("Non-digit pattern not found");
        }
        
        // Whitespace detection
        String in4 = "Welcome Home";
        Pattern p7 = Pattern.compile("\\s");
        Matcher m7 = p7.matcher(in4);
        
        if (m7.find()) {
            System.out.println("Whitespace found");
        } else {
            System.out.println("No whitespace found");
        }
        
        while (m7.find()) {
            System.out.println("whitespace character: " + m7.group() + " at position: " + m7.start());
        }
        
       

        // Non-whitespace detection
        String in3 = "Welcome Home";
        Pattern p6 = Pattern.compile("\\S"); // \S for non-whitespace
        Matcher m6 = p6.matcher(in3);
        
        while (m6.find()) {
            System.out.println("Non-whitespace character: " + m6.group() + " at position: " + m6.start());
        }
        
        //Beginning of the line and end of the line
        
        
        String in5 = "Welcome to the world of Java! ; hi";
        Pattern p8 = Pattern.compile("^Welcome.*hi$"); // ^ for the beginning of the line and $ for the end of the line
        Matcher m8 = p8.matcher(in5);
        
        if (m8.find()) {
            System.out.println("The string starts with 'Welcome'and ends with hi.");
        } else {
            System.out.println("The string does not start with 'Welcome' or end with hi.");
        }
    }
}
