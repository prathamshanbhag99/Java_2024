
package Lab3;
import java.util.Arrays;

public class Lab3_4 {
    public static void main(String[] args) {
        
        String[] products = {
            "Lenovo",
            "Dell",
            "Hp",
            "Apple",
            "Asus"
        };

       
        Arrays.sort(products);

       
        System.out.println("Sorted product names:");
        for (String product : products)
        {
            System.out.println(product);
        }
    }
}
