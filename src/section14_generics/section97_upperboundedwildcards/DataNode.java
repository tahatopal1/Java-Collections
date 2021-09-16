package section14_generics.section97_upperboundedwildcards;

public class DataNode<E> {
	
	private E data;
	private DataNode<? extends Number> next; // Wildcard usage with boundary
	
	public DataNode(E data, DataNode<? extends Number> next) {
		super();
		this.setData(data);
		this.setNext(next);
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public DataNode<? extends Number> getNext() {
		return next;
	}

	public void setNext(DataNode<? extends Number> next) {
		this.next = next;
	}
	
	
	
	
}
