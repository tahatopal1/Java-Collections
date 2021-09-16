package section14_generics.section90_genericinterface;

public class Data<T> implements IData<T> {
	
	private T data;

	@Override
	public T getData() {
		return this.data;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}

}
