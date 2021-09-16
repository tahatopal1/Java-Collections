package section13_streams.section82_streamsbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsBasicApplication {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		// Traditional Way
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (Integer integer : list) {
			if (integer >= 30) {
				newList.add(integer);
			}
		}
		
		System.out.println(newList);
		
		// With streams (filter)
		List<Integer> anotherList = list.stream().filter(i -> i >= 30).collect(Collectors.toList());
		System.out.println(anotherList);
		
		// Map
		List<Integer> anotherList2 = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(anotherList2);
		
		// Count
		long count = list.stream().filter(i -> i >= 30).count();
		System.out.println(count);
		
		// Default Natural Sorting: sorted()
		List<Integer> anotherList3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(anotherList3);
		
		// Custom Sorting: sorted(Comparator c)
		List<Integer> anotherList4 = list.stream()
										.sorted((i1, i2) -> i2.compareTo(i1))
										.collect(Collectors.toList());
		System.out.println(anotherList4);
		
		// forEach, min, max
		
		
	}
}
