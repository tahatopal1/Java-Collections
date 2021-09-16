package section6_genericsoverview;

import java.util.ArrayList;

public class GenericsOverviewApplication {

	public static void main(String[] args) {
		
		// We have to use arrays with exact size which is determined at compile time
		String[] strArray = new String[10];
		Employee[] empArray = new Employee[20];
		
		strArray[0] = "Tom";
		empArray[0] = new Employee();
		// strArray[0] = new Employee(); This is not valid, causes compile time error
		// And this is called 'type-safety'
		
		ArrayList arrayList = new ArrayList();
		
		// We can add any type except primitive ones.
		arrayList.add("Tom");
		arrayList.add(new Employee());
		
		// When we retrieve the elements, compiler pushes to type-casting
		String strRetrieval = (String) arrayList.get(0);
		
		// This causes runtime error (ClassCastException)
		strRetrieval = (String) arrayList.get(1);
		
	}

}
