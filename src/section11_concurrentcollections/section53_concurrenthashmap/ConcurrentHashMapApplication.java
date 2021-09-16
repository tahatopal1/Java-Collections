package section11_concurrentcollections.section53_concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapApplication {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(0, "Basics");
		map.put(1, "Application");
		map.put(0, "Tech");
		System.out.println(map);
		
		map.putIfAbsent(0, "Hello"); // Since it's present, couldn't be replaced
		System.out.println(map);
		
		map.remove(1, "Application"); // Key-value must be consistent
		System.out.println(map);
		
		System.out.println(map.replace(0, "Tech", "Technology"));
		System.out.println(map);
		
		map.replace(0, "Last Example");
		System.out.println(map);

	}

}
