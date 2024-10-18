package pac1;

public class TC_Vararg {

    void printdetails(String msg, int... numbers) {
        for (int i : numbers) {
            System.out.println(i);
            System.out.println(msg);
            
        }
    }

    public static void main(String[] args) {
        TC_Vararg obj = new TC_Vararg();
        obj.printdetails("Hello", 500);
    }
}
