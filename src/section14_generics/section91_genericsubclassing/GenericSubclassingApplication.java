package section14_generics.section91_genericsubclassing;

public class GenericSubclassingApplication {

	public static void main(String[] args) {
		BaseData<String> baseData = new BaseData<String>();
		Data<Integer> data = new Data<Integer>();
		
		// baseData = data; Compiler Error: Cannot convert 
	}

}
