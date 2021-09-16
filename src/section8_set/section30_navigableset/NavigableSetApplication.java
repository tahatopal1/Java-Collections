package section8_set.section30_navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetApplication {
	public static void main(String[] args) {
		
		NavigableSet navigableSet = new TreeSet();
		navigableSet.add(1000);
		navigableSet.add(300);
		navigableSet.add(13000);
		navigableSet.add(40000);
		navigableSet.add(54000);
		
		System.out.println("Floor(1350): " + navigableSet.floor(13550)); // Floor: Less than or equal
		System.out.println("Lower(1400): " + navigableSet.floor(1400)); // Lower: Less than
		System.out.println("Ceiling(2500): " + navigableSet.ceiling(2500)); // Ceiling: Greater than or equal
		System.out.println("Higher(4000): " + navigableSet.higher(4000)); // Higher: Greater than
		
		System.out.println(navigableSet.pollFirst()); // Fetching and removing the least element
		System.out.println(navigableSet.pollLast()); // Fetching and removing the greatest element
		
	}
}
