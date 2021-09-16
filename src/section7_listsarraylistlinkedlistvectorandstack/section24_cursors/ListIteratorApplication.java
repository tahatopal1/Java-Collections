package section7_listsarraylistlinkedlistvectorandstack.section24_cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorApplication {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Tom");
		arraylist.add("John");
		arraylist.add("Peter");
		arraylist.add("Michael");
		arraylist.add("Tony");
		
		System.out.println("Current arraylist: " + arraylist);
		
		ListIterator listIterator = arraylist.listIterator();
		
		while (listIterator.hasNext()) {
			String object = (String) listIterator.next();
			if (object.equals("Tom")) {
				listIterator.remove();
			}
			if (object.equals("Peter")) {
				listIterator.set("Pete");
			}
			if (object.equals("Michael")) {
				listIterator.add("Harry");
			}
		}
		
		System.out.println("Last situation of arraylist: " + arraylist);
		 
	}

}
