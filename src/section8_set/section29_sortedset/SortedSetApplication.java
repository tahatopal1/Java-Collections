package section8_set.section29_sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApplication {
	public static void main(String[] args) {
		SortedSet sortedSet = new TreeSet();
		
		sortedSet.add(4);
		sortedSet.add(5);
		sortedSet.add(1);
		sortedSet.add(9);
		sortedSet.add(12);
		sortedSet.add(26);
		
		System.out.println(sortedSet);
		
		System.out.println("First element: " + sortedSet.first());
		System.out.println("Last element: " + sortedSet.last());
		
		System.out.println("TreeSet before 5: " + sortedSet.headSet(5));
		System.out.println("TreeSet after 5: " + sortedSet.tailSet(5));
		
		System.out.println("Subset between 4-12: " + sortedSet.subSet(4, 12));
		
	}

}
