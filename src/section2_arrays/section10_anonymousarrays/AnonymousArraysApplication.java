package section2_arrays.section10_anonymousarrays;

public class AnonymousArraysApplication {

	public static void main(String[] args) {
		
		// new int[] {1,2,3}; -> This is an anonymous array
		// For instant use (for example, as a method parameter) we should use anonymous arrays.
		
		sum(new int[] {1,5,9}); // We don't have to declare an array, we use an anonymous one instead
		// sum(new int[3] {1,5,9}); -> Another invalid declaration
		
		
	}

	private static void sum(int[] is) {
		int sum = 0;
		for (int i : is) {
			sum += i;
		}
		System.out.println(sum);
	}

}
