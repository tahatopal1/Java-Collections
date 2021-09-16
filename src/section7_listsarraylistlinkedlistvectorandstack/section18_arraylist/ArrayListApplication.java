package section7_listsarraylistlinkedlistvectorandstack.section18_arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListApplication {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList(); // Size is 10 by default
		ArrayList sizedArrayList = new ArrayList(30); // Size is defined as 30
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(10);
		
		// This is valid, you can pass any collection type then it will be converted
		ArrayList convertedArrayList = new ArrayList(set);
		
		// Heterogen inserting
		arrayList.add("John"); 
		arrayList.add(true);
		arrayList.add(10);
		
		// Retrieving
		System.out.println("arrayList(0): " + arrayList.get(0));
		
		// Removing
		// When we want to remove an Integer object, it should be like below
		arrayList.remove(new Integer(10));
		// We shouldn't do it like this: arrayList.remove(10); because it removes 10. index
		
		// Generic arraylist
		ArrayList<String> genericArrayList = new ArrayList<String>();
		genericArrayList.add("Tom");
		genericArrayList.add("John");
		genericArrayList.add("Dennis");
		
		// Removing the element on 1st index
		genericArrayList.remove(1);
		
		System.out.println("Fetching the data on 1st index after removing: "
													+ genericArrayList.get(1));
		// Prints Dennis, so it has been shifted.
		
		
		
	}
}
