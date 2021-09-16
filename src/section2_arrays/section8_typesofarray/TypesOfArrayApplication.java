package section2_arrays.section8_typesofarray;

public class TypesOfArrayApplication {
	
	/* 1. Primitive Types
	 * 2. Objects
	 * 3. Abstract Class Type
	 * 4. Interface Type	
	*/
	
	public static void main(String[] args) {
		
		System.out.println("***** PRIMITIVE TYPE *****");
		
		// Primitive type
		int[] x = new int[3];
		x[0] = 'a'; // char to int type promotion
		System.out.println(x[0]); // Prints 97
		byte b = 2;
		x[1] = b; // byte to int type promotion
		
		System.out.println("***** OBJECT TYPE *****");
		
		// Object type
		Object[] objArray = new Object[5];
		System.out.println(objArray[0]); // prints null
		
		objArray[0] = new Object();
		objArray[1] = new String();
		
		System.out.println(objArray[0]); // prints blank
		System.out.println(objArray[1]); // print created objects reference
		
		System.out.println("***** ABSTRACT CLASS TYPE *****");
		
		// Abstract class type
		// Abstract class type of array only can be initialized by it's child classes
		Number[] numArray = new Number[3];
		System.out.println(numArray[0]); // Prints null
		numArray[0] = new Integer(1); // Integer is a child of Number
		numArray[1] = new Byte("2"); // Byte is a child of Number
		
		System.out.println("***** INTERFACE TYPE *****");
		
		// Interface class type
		// Interface class type of array can only be initialized by it's child classes
		Runnable[] r = new Runnable[5];
		System.out.println(r[0]); // Prints null
		r[0] = new Thread();
		
		
	}

}
