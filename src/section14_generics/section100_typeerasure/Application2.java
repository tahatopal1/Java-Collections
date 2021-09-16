package section14_generics.section100_typeerasure;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		example(15); // ClassCastException!!!
	}
	
	public static String example(Integer x) {
		
		List<String> a = new ArrayList<String>();
		List b = a;
		
		// list a and list b are actually the same
		
		b.add(x); // trying 3
		
		return a.iterator().next();
		
	}
	

}
