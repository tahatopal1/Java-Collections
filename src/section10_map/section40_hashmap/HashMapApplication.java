package section10_map.section40_hashmap;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {

	public static void main(String[] args) {
		HashMap map = new HashMap(); //Default cap -> 16, loading factor -> .75
		Map m = new HashMap(); // Map reference
		HashMap map3 = new HashMap(20); // Cap -> 20 
		HashMap map4 = new HashMap(20, 0.9f); // Cap -> 20, loading factor -> .9
		HashMap map5 = new HashMap(m); // With map parameter
		
		HashMap<String, Integer> map6 = new HashMap<String, Integer>(); // Generic HashMap
		map6.put("Science", 90);
		map6.put("Math", 80);
		map6.put("English", 90);
		map6.put("Science", 70); // It just changes the value of Science lesson
		System.out.println(map6);
		
		System.out.println("Getting Maths score: " + map6.get("Math"));
		
		System.out.println("Key set: " + map6.keySet());
		System.out.println("Entry set: " + map6.entrySet());
		System.out.println("Values: " + map6.values());
		
		System.out.println("If the map contains 'Science' key: " + map6.containsKey("Science"));
		System.out.println("If the map contains value of 80 : " + map6.containsValue(80));
		
		System.out.println("Removal of English lesson: " + map6.remove("English"));
		System.out.println("Map after removing: " + map6);
		
		System.out.println("Attempt to remove Science " + map6.remove("Scicence", 90)); // Value is wrong, won't work
		System.out.println("After attempt: " + map6);
		
		System.out.println();
		Map<String, String> map7 = new HashMap<String, String>();
		map7.computeIfAbsent("Hello", k -> k + "Basic Course");
		System.out.println(map7);
		map7.computeIfAbsent("Hello", k -> k + " Basic Course"); // It won't work twice, map is present.
		map7.computeIfPresent("Hello", (a, b) -> b + "-" + a); // Key is present, it will work.
		System.out.println(map7);
		
		
	}

}
