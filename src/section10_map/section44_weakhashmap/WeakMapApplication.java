package section10_map.section44_weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakMapApplication {

	public static void main(String[] args) throws InterruptedException {
		
		Map map = new HashMap();
		Temp temp = new Temp();
		
		map.put(temp, "element");
		System.out.println(map);
		
		temp = null; // Became available for garbage collector
		System.gc();
		Thread.sleep(3000);
		System.out.println(map); // As we see, object wasn't removed.
		
		System.out.println();
		
		// Trying out with WeakHashMap
		WeakHashMap weakHashMap = new WeakHashMap();
		Temp weakTemp = new Temp();
		
		map.put(weakTemp, "element");
		System.out.println(weakHashMap);
		
		weakHashMap = null; // Became available for garbage collector
		System.gc();
		Thread.sleep(3000);
		System.out.println(weakHashMap); // There is no object as we see
		
	}

}
