package pac1;
import java.util.*;
public class TC_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s1= new HashSet<Integer>();
		s1.add(100);
		s1.add(101);
		s1.add(102);
		s1.add(103);
		s1.add(104);
		s1.add(105);
		s1.add(106);
		
		System.out.println("size :"+s1.size());
		
		for(Integer index:s1)
		{
			System.out.println(index+"");
		}
	

	}

}
