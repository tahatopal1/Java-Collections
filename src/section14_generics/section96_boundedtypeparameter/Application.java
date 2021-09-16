package section14_generics.section96_boundedtypeparameter;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		// Standart list definitions with generics
		List<Integer> list = Arrays.asList(new Integer[] {2,5,8,9});
		List<String> listString = Arrays.asList(new String[] {"str1", "str2", "str3"});
		
		DataSorter<Integer> sorter = new DataSorter<Integer>(list);
		sorter.getSortedData();
		
		// Cannot use below. String isn't a subclass of 'Number'
		//DataSorter<String> sorterString = new DataSorter<String>(listString);
		
		System.out.println("**********");
		getSortedData(list);
		
		// Another compile-time error just because of type boundary
		//getSortedData(listString);
		
		
		
	}
	
	// Equivalent example for bounded generics with method
	public static <T extends Number> void getSortedData(List<T> list) {
		list.sort(null);
		for(T t: list) {
			System.out.println(t);
		}
	}
	
	// Another example of definition (multiple interfaces)
	public static <T extends IBound1 & IBound2> void getSortedData2(List<T> list) {
		list.sort(null);
		for(T t: list) {
			System.out.println(t);
		}
	}

}

interface IBound1{}
interface IBound2{}


