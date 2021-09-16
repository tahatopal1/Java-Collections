package section2_arrays.section9_assigningandreassigning;

public class AssigningAndReassigningApplication {

	public static void main(String[] args) {
		
		int[] x = new int[3];
		int[] a = x; // Now, array 'a' and 'x' are identical.
		
		// Both of their indices of array equals '0' by default
		System.out.println(a[0]);
		System.out.println(x[0]);
		System.out.println("-----------------------");
		
		// Once we override one index, it will be reflected on both arrays
		x[0] = 5;
		System.out.println(a[0]);
		System.out.println(x[0]);
		System.out.println("-----------------------");
		
		int[] b = {1, 2, 3};
		int[] c = {22, 33};
		
		System.out.println("Before asigning: ");
		
		System.out.println("b: ");
		for (int i : b) {
			System.out.print(i + "-");
		}
		
		System.out.println();

		System.out.println("c: ");
		for (int i : c) {
			System.out.print(i + "-");
		}
		
		b = c;
		
		System.out.println();
		System.out.println("After asigning: ");
		
		System.out.println("b: ");
		for (int i : b) {
			System.out.print(i + "-");
		}
		
		System.out.println();

		System.out.println("c: ");
		for (int i : c) {
			System.out.print(i + "-");
		}
		
	}

}
