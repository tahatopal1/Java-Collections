package section7_listsarraylistlinkedlistvectorandstack.section22_vector;

import java.util.Vector;

public class VectorApplication {

	public static void main(String[] args) {
		Vector v = new Vector();
		Vector vec = new Vector(15);
		Vector vec1 = new Vector(100, 5); // 5 is capacity increment amount
		
		v.add(10);
		v.addElement("Hello");
		System.out.println(v);
		v.remove(0);
		
		v.add("Janet");
		v.add(true);
		
		System.out.println(v);
		System.out.println(v.elementAt(0));
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.get(0));
		
		System.out.println("Size: " + v.size()); // Amount of elements
		System.out.println("Capacity: " + v.capacity()); // The actual capacity
		 
	}

}
