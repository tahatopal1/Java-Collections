package section12_lambda.section77_supplier;

import java.util.function.Supplier;

public class SupplierApplication {

	public static void main(String[] args) {
		Supplier<String> s = () -> "Productivity";
		System.out.println(s.get());
	}

}
