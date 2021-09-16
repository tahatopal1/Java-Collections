package section12_lambda.section63_invokelambda;

@FunctionalInterface
public interface ValidFunInterface{
	
	public void method1();
	//public void method2(); -> Cannot do that 
	
	// Default Method
	default void method2() {
		
	}
	
	// Static Method
	static void method3() {
		
	}
	
}
