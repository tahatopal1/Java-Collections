package section14_generics.section99_behaviour;

import java.util.ArrayList;

public class BehaviourApplication {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // Generic type
		list.add("Str1");
		list.add("Str2");
		method(list);
		System.out.println(list);
	}
	
	public static void method(ArrayList l) { // Raw type
		l.add(10);
		l.add("Str3");
		l.add(true);
		l.add(new Member("John", "Black"));
	}

}
