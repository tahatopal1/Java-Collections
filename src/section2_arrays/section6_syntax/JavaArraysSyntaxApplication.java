package section2_arrays.section6_syntax;

public class JavaArraysSyntaxApplication {

	// This application is a practice about Java arrays syntax
	// Non-commented lines are valid
	
	public static void main(String[] args) {
		
		int[] x1;
		int [] x2;
		int x3[];
		
		//int[3] x4; Size cannot be specified in reference
		int x5[], x6[];
		//int x7[], []x8; Size box cannot come before the variable name after comma is used
		int[] x9, x10[];
		
		int[] x01, x02;
		
		//--- Multi-Dimentional Declarations ---//
		
		int[][] x11;
		int [][]x12;
		int [][] x13;
		
		int []x14[];
		int x15[][];
		int[][] x16, x17; // Both of them 2D
		
		int[] x18[], x19; // x18 is 2D, x19 is 1D
		int[] []x20, x21; // Both of them 2d
		
		int[] [] [] x22, x23;
		
		int [][][] x25 = new int[3][4][5];
		int [][][] x26 = new int[3][4][];
		
		// int [][][] x27 = new int[3][][5]; Not valid
		// int [][][] x28 = new int[][4][5]; Not valid
		
		
		
		
		
	}

}
