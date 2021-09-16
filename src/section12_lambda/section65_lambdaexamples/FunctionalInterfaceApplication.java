package section12_lambda.section65_lambdaexamples;

public class FunctionalInterfaceApplication {
	public static void main(String[] args) {
		
		FunctionalInterface1 functionalInterface1 
						= () -> System.out.println("Function without any argument and return type");
		functionalInterface1.functionalMethod1();		
		
		FunctionalInterface2 functionalInterface2
						= (a, b) -> System.out.println("Sum of two integer: " + (a + b));
		functionalInterface2.sum(5, 10);
		
		FunctionalInterface3 functionalInterface3 = s -> s.length();
		System.out.println("Length: " + functionalInterface3.findLength("Productivity"));
		
		FunctionalInterface4 functionalInterface4 = a -> {
			int x = a + 10;
			x = x/2;
			return x;
		};
		
		int calculated = functionalInterface4.doSomeCalculation(5);
		System.out.println("Calculated value: " + calculated);
	}

}
