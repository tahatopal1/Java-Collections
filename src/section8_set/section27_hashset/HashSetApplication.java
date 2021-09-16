package section8_set.section27_hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetApplication {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet(); // Capacity is 16 by default, loading factor = 0.75
		HashSet hashSet1 = new HashSet(30); // Capacity is 30
		
		
		HashSet hashSet2 = new HashSet(100); // When the 75 is filled, capacity will be doubled.
		HashSet hashSet3 = new HashSet(100, 0.8f); // When the 80 is filled, capacity will be doubled.
		
		HashSet hashSet4 = new HashSet(new ArrayList()); // (Collection c) constructor
		
	}

}
