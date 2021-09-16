package section10_map.section47_treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApplication {
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		// TreeMap m1 = new TreeMap(Comparator c);
		TreeMap m1 = new TreeMap(new CustomSorting());
		SortedMap s = new TreeMap();
		TreeMap m7 = new TreeMap(s);
		
		
		Map m4 = new HashMap();
		TreeMap m2 = new TreeMap(m4);
		
		m.put(23, "");
		m.put(10, "");
		m.put(10, "Basics"); // Doesn't allow duplicated keys
		m.put(11, "Education");
		System.out.println(m);
		
		m1.put(23, "");
		m1.put(10, "");
		m1.put(10, "Basics"); // Doesn't allow duplicated keys
		m1.put(11, "Education");
		System.out.println(m1);
		
	}

}
