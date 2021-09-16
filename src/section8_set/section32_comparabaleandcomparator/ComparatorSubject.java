package section8_set.section32_comparabaleandcomparator;

import java.util.Comparator;

public class ComparatorSubject implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		// Comparing according to sum of the number values
		
		int t1 = sumOfNumberValues(o1);
		int t2 = sumOfNumberValues(o2);
		
		if (t1 > t2) {
			return 1;
		}else if (t2 > t1) {
			return -1;
		}
		
		return 0;
	}
	
	private int sumOfNumberValues(Integer o1) {
		
		int sum = 0;
		char[] numberElements = String.valueOf(o1).toCharArray();
		
		for(int i = 0; i < numberElements.length; i++) {
			sum += Integer.parseInt(""+numberElements[i]);
		}
		
		return sum;
		
	}

}
