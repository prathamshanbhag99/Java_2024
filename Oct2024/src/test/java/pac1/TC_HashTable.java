package pac1;

import java.util.Hashtable;

public class TC_HashTable {

    public static void main(String[] args) {
        // Create a Hashtable 
        Hashtable<String, Double> ht = new Hashtable<String, Double>();

        // Adding elements to the Hashtable
        ht.put("Arun", 34.55);
        ht.put("Ram", 45.66);
        ht.put("Pooja", 4.95);
        //ht.put(null, null);

        // Printing the entire Hashtable
        System.out.println(ht);

        // Printing only the values of the Hashtable
        System.out.println(ht.values());

        // Printing only the keys of the Hashtable
        System.out.println(ht.keySet());
    }
}
