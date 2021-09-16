package section8_set.section31_treeset;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetApplication {
	public static void main(String[] args) {
		
		try {
			TreeSet treeSet = new TreeSet();
			treeSet.add(null); 
			treeSet.add(5); // Cannot add element after null, (Cannot invoke java.lang.Comparable.compareTo()
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		// TreeSet treeset1 = new TreeSet(Comparator c); A valid instantiation
		
		SortedSet sortedSet = new TreeSet();
		TreeSet treeset1 = new TreeSet(sortedSet);
		
		HashSet hashSet = new HashSet();
		TreeSet treeSet1 = new TreeSet(hashSet);
		
		// Generic definition
		// Generic type must implement from 'Comparable' interface
		TreeSet<Employee> ts4 = new TreeSet<Employee>(); 
		
		// Reverse of the treeset
		System.out.println(ts4.descendingSet());

		
	}

}
