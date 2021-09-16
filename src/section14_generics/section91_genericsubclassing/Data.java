package section14_generics.section91_genericsubclassing;

public class Data<T> extends BaseData<T> implements IData<T> {
	
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
