package section10_map.section43_identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApplication {
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> identityHashMap = new IdentityHashMap<Integer, String>();
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		hashMap.put(a, "London");
		hashMap.put(b, "Paris");
		
		identityHashMap.put(a, "London");
		identityHashMap.put(b, "Paris");
		
		System.out.println(hashMap);
		System.out.println(identityHashMap);
		
	}

}
