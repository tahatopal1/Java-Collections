package section14_generics.section90_genericinterface;

public class GenericInterfaceApplication {

	public static void main(String[] args) {
		IData<String> idata = new Data<String>();
		idata.setData("This is the data");
		System.out.println("Printing the data: " + idata.getData());
	}

}
