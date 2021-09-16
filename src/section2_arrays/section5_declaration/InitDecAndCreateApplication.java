package section2_arrays.section5_declaration;

public class InitDecAndCreateApplication {

	public static void main(String[] args) {
		
		// This application is all about initialization, declaration and creation

		// Operations for 1D Arrays
		System.out.println("1D Operations");
		
		int[] x; // A simple declaration
		// x = {1,3,4};  Array constant can only be used in initializers, compile time error
		
		int[] z = new int[3];
		System.out.println(z[0]); // All will print '0'
		System.out.println(z[1]); // So it means, with this syntax, we initialize with '0'
		System.out.println(z[2]); // And we declared and created it aswell
		
		// Overriding initialized values
		z[0] = 10;
		z[1] = 20;
		z[2] = 30;
		
		for (int elem : z) { // This will print all overriden values
			System.out.println(elem);
		}
		
		System.out.println(z); // This will print reference address of 'array z'
		
		// Operations for 2D Arrays
		System.out.println("2D Operations");
		
		int[][] a; // basic declaration
		int[][] b = new int[2][];
		//System.out.println(b[0]);  It will cause NullPointerException,
								// since we don't initialize the sub-arrays (they are actually null)
		
		b[0] = new int[2]; // Now the sub-arrays has been initialized by '0' values and created
		b[1] = new int[3];
		System.out.println(b[0][0]); // Prints '0'
		
		// Overriding the initialized value of b[0][0]
		b[0][0] = 55;
		
		System.out.println(b[0]); // This will print reference address of 'sub-array b'
		
		System.out.println(b[0][0]); // Prints 55
		
		// Declaring, creating and initializing 2D array in a single row
		int[][] arr = {{1,2,3},{6,7}};
		
		// Printing all the elements by using foreach
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
	}

}
