package inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child c1 = new Child("F", "L");
		Child c2 = new Child("F", "L");
		
		List<String> list = new ArrayList<>();
		
		Parent p = new Parent("F");
		
		System.out.println(list instanceof List);
 		System.out.println(p.getClass().isInstance(c1));
		
	}
}
