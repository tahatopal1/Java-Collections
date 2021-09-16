package section12_lambda.section72_sortingwithlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambdaApplication {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(0);
		list.add(3);
		list.add(11);
		
		System.out.println(list);
		System.out.println("Non-sorted: " + list);
		
		// Natural (ascending) sort
		Collections.sort(list);
		System.out.println("Natural sorted: " +  list);
		
		// Descending sort by using a custom comparator
		Collections.sort(list, new CustomComparator());
		System.out.println("Descending sort by using a custom comparator: " + list);
		
		// Descending sort with lambda expression
		Collections.sort(list, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2 ? 1 : 0));
		System.out.println("Descending sort with lambda expression: " + list);
		
	}
	
}

class CustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 > o2) ? -1 : (o1 < o2 ? 1 : 0);
	}
	
}
