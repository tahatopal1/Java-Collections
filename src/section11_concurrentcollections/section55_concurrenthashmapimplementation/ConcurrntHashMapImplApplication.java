package section11_concurrentcollections.section55_concurrenthashmapimplementation;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrntHashMapImplApplication extends Thread {
	
	static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
	
	public static void main(String[] args) throws InterruptedException {
		
		ConcurrntHashMapImplApplication tChild = new ConcurrntHashMapImplApplication();
		map.put(1, "John");
		map.put(2, "Rohn");
		map.put(3, "Tom");
		map.put(4, "Shiva");

		tChild.start();
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry entry = itr.next();
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
			Thread.sleep(100);
		}
		
	}
	
	public void run() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put(4, "Jack");
	}
	
}
