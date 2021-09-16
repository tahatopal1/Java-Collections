package section12_lambda.section78_doublecolonoperator;

public class DoubleColonOperatorApplication {

	public static void main(String[] args) {
		CustomFunctionalInterface funInter = () -> System.out.println("I am a Lambda");
		funInter.customFunctionalMethod();
	}
	
	// Static Example
	public static void method2() {
		System.out.println("I am not a Lambda");
	}
	
	// Instance Example
	public void method3() {
		System.out.println("I am not a Lambda");
	}

}

@FunctionalInterface
interface CustomFunctionalInterface{
	public void customFunctionalMethod();
}

class NewCallerClass{
	public static void main(String[] args) {
		
		// Static referencing by using class
		CustomFunctionalInterface i = DoubleColonOperatorApplication :: method2;
		i.customFunctionalMethod();
		
		// Non-static referencing by using object
		DoubleColonOperatorApplication application = new DoubleColonOperatorApplication();
		i = application :: method3;
		i.customFunctionalMethod();
	}
}
