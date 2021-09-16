package section7_listsarraylistlinkedlistvectorandstack.section24_cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class EnumerationApplication {

	public static void main(String[] args) {
		
		Vector v =  new Vector(21);
		
		for(int i = 0; i < 20; i++) {
			v.add(i);
		}
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Integer object = (Integer) e.nextElement();
			if (object % 3 == 0) {
				System.out.println(object);
			}
		}
		
	}

}
