package section14_generics.section100_typeerasure;

import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> a = new LinkedList<String>(); // Eqiuvalent of "List a = new LinkedList<String>()"
		List b = a;
		
		a.add("Trying1");
		b.add("Trying2");
		b.add(13); // trying 3
		a.add(13); // trying 4, compile-time error
		
	}
	
	// Overloading example 
	// Cannot be overloaded like that, because they are actually the same
	public void method(List<String> list) { }
	
	public void method(List<Integer> list) { }

}
