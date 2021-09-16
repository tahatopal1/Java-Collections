package section7_listsarraylistlinkedlistvectorandstack.section20_linkedlist;

import java.util.LinkedList;

public class LinkedListApplication {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("John");
		linkedList.add(10);
		linkedList.add(null);
		System.out.println(linkedList);
		
		linkedList.set(1, 13);
		System.out.println(linkedList);

		linkedList.add(2, true);
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		linkedList.addFirst(linkedList);
		System.out.println(linkedList);
		
	}

}
