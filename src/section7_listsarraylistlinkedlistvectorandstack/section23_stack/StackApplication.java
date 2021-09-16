package section7_listsarraylistlinkedlistvectorandstack.section23_stack;

import java.util.Stack;

public class StackApplication {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(30);
		s.push(true);
		
		Object o = s.pop(); // Removes the last in object
		System.out.println(s);
		Object obj = s.peek(); // Don't remove, only peeks the last in object
		System.out.println(obj);
		
		System.out.println(s.empty()); // Controls if the stack is empty
		System.out.println(s.search(10)); // Searches the element, if it's found return the index
	}

}
