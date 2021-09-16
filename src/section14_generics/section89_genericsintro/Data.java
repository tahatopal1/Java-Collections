package section14_generics.section89_genericsintro;

public class Data<T> {
	
	// T is type parameter
	
	private T data;

	public Data(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Data is " + data;
	}
	
	
}
