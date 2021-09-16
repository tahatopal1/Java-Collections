package section2_arrays.section9_assigningandreassigning;

public class ReassigningDifferentTypesApplication {

	public static void main(String[] args) {
		
		String[] s = new String[3];
		Object[] o = s; // Since String type is child class of Object, this assigning is valid
		
		short[] shorts = new short[2];
		//int[] ints = shorts;
		
		// Type of short[] is: [S
		// Type of int[] is: [I
		
		// There is no correlation between [S and [I.
		// So we cannot assign a short array to a integer array
		
	}

}
