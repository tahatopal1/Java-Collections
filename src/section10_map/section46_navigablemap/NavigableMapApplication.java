package section10_map.section46_navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApplication {

	public static void main(String[] args) {
		
		NavigableMap<String, Integer> t = new TreeMap<String, Integer>();
		t.put("ABC", 123);
		t.put("DEF", 456);
		t.put("HIJ", 789);
		t.put("MNO", 546);
		t.put("PQR", 776);
		t.put("XYZ", 775);
		t.put("STU", 544);
		t.put("LMN", 543);
		
		System.out.println(t);
		
		System.out.println(t.ceilingEntry("HIJ")); // Returns an entry with the least key greater than or equal to key
		System.out.println(t.floorKey("PQS")); // Returns the greatest key less than or equal to key
		System.out.println(t.higherKey("PQR")); // Returns the least key greater than key 
		System.out.println(t.lowerKey("PQR")); // Returns the least key greater than key 
		System.out.println(t.ceilingKey("XYZ")); // Returns the least key greater than or equal to key
		System.out.println(t.descendingKeySet()); // Returns the keyset with descending order
		System.out.println(t.descendingMap()); // Returns the map with descending order
		System.out.println(t.headMap("MNO")); // Returns headmap according to 'MNO' 
		System.out.println(t.headMap("MNO", true)); // Returns headmap accorting to MNO including itself
		System.out.println(t.subMap("HIJ", "PQR")); // Returns supmap between 'HIJ' and 'PQR' not including 'PQR'
		System.out.println(t.subMap("HIJ", true, "PQR", true)); // Returns supmap between 'HIJ' and 'PQR' not including both
		System.out.println(t.tailMap("JKL")); // Returns tailMap starting from 'JKL' ('JKL' does not exists btw)
		System.out.println(t.tailMap("PQR", false)); // Returns tailMap of 'PQR' without itself (normally stated key is included)
		System.out.println(t.higherEntry("STU")); // Returns entry with the least key greater than key
		System.out.println(t.navigableKeySet()); // Returns the keyset as a NavigableSet
		
	}

}
