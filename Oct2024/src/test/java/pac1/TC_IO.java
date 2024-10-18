package pac1;

public class TC_IO {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        char c;
        System.out.println("Enter a String:");
        try {
            while ((c = (char) System.in.read()) != '\n') {
                sb.append(c);
            }
        } catch (Exception e) {
            System.out.println("Error while reading: " + e.getMessage());
        }

        String s = new String(sb);
        System.out.println("You entered: " + s);
    }
}
