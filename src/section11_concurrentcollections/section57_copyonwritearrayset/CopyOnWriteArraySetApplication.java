package section11_concurrentcollections.section57_copyonwritearrayset;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetApplication {

	public static void main(String[] args) {
		CopyOnWriteArraySet<String> arraySet = new CopyOnWriteArraySet<String>();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Basics");
		list.add("Basics");
		list.add("Application");
		list.add("Application");
		
		CopyOnWriteArraySet<String> arraySet2 = new CopyOnWriteArraySet<String>(list);
		System.out.println(arraySet2);
	}

}
