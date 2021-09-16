package section14_generics.section96_boundedtypeparameter;

import java.util.List;

// This class uses bounded generic (bounded with Number type)
public class DataSorter<T extends Number> {
	
	private List<T> list;

	public DataSorter(List<T> list) {
		super();
		this.list = list;
	}
	
	public void getSortedData() {
		list.sort(null);
		for(T t: list)
			System.out.println(t);
	}
	
}
