package section11_concurrentcollections.section56_copyonarraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListApplication {
	
	static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
	
	public static void main(String[] args) {
		list.add("John");
		list.add("Rohn");
		list.add("Harry");
		list.add("Tom");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			if ("Harry".equals(iterator.next())) {
				iterator.remove(); // Causes UnsupportedOperationException 
			}
		}
		
		System.out.println(list);
		
	}

}
