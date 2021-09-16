package section12_lambda.section75_function;

import java.util.function.Function;

public class FunctionApplication {

	public static void main(String[] args) {
		
		String s = "Productivity";
		
		// Using standart version
		int len = calLength(s);
		System.out.println(len);
		
		// Using lambda expression
		Function<String, Integer> calLen = length -> length.length();
		len = calLen.apply(s);
		System.out.println(len);
		
	}

	
	// Standart Version
	private static int calLength(String s) {
		return s.length();
	}

}
