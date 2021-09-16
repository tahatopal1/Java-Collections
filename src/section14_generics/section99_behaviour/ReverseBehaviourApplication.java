package section14_generics.section99_behaviour;

import java.util.ArrayList;

public class ReverseBehaviourApplication {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Str1");
		list.add("Str2");
		method(list);
		System.out.println(list);
	}
	
	public static void method(ArrayList<String> l) { // Raw type
		//l.add(10);
		l.add("Str3");
		//l.add(true);
		//l.add(new Member("John", "Black"));
	}

}
