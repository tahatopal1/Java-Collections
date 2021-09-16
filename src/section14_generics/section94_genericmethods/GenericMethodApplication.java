package section14_generics.section94_genericmethods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodApplication {

	public static <T> String concat(T data) {
		return "Data is: " + data;
	}
	
	public static void main(String[] args) {
		
		// Generic Method
		System.out.println(concat("Application"));
		System.out.println(concat(55));
		System.out.println(concat(true));
		
		// Generic constructor
		Box box = new Box(new ArrayList<String>());
		Box box1 = new Box(new ArrayList<Integer>());
		
		
	}

}
