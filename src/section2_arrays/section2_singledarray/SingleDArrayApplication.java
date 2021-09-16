package section2_arrays.section2_singledarray;

public class SingleDArrayApplication {

	public static void main(String[] args) {
		
		int[] x = new int[1000];
		System.out.println(x.getClass().getName());
		
		int[] y = new int[0]; // Valid
		// int [] y = new int[]; Is not valid, compile time error
		
		int[] z = new int['a']; // Valid (type promotion)
		
		try {
			int[] t = new int[-1]; // Is not valid, runtime error
		}catch (Exception e) {
			System.out.println("Exception: " + e.getClass().getName());
		}
		
		
		//int[] q = new int[10000000000]; Is not valid, compile time error
	}

}
