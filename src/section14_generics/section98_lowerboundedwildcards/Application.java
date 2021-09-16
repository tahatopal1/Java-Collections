package section14_generics.section98_lowerboundedwildcards;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void displayData(List<? super Integer> l) {
		for (Object object : l) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Number> list2 = new ArrayList<Number>();
		
		list.add(12);
		list.add(13);
		list2.add(14);
		list2.add(15);
		
		displayData(list);
		displayData(list2);
		
		
	}

}
