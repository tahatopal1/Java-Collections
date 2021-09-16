package section7_listsarraylistlinkedlistvectorandstack.section24_cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorApplication {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(17);
		for (int i = 0; i < 16; i++) {
			arrayList.add(i);
		}
		
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if(integer % 3 == 0)
				System.out.println(integer);
			else
				iterator.remove();
		}
		
		System.out.println(arrayList);
		
	}
}
