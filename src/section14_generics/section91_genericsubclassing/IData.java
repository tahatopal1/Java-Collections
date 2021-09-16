package section14_generics.section91_genericsubclassing;

public interface IData<T> extends IBase<T>{
	
	public T getData();
	
	public void setData(T data);
	
}
