
package pac1;

import java.util.HashMap;


public class TC_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm= new HashMap<String,String>();
		hm.put("1234","hello");
		hm.put("123","Ascendion");
		hm.put("456","java");
		
		System.out.println(hm.get("123"));
		
		System.out.println(hm.values());
	}

}
