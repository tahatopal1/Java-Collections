package section12_lambda.section63_invokelambda;

public class LambdaIntroduction {

	public static void main(String[] args) {
		
		// Before lambda
		CallFunInterface funInter = new CallFunInterface();
		funInter.funMethod();
		
		// Using lambda
		// We don't use any separate implementation
		ValidFunInterface funInterfaceLambda = () -> System.out.println("Functional Method");
		funInterfaceLambda.method1();
		
		
	}
	
}

interface CustomFunctionalInterface{
	public void funMethod();
}

class CallFunInterface implements CustomFunctionalInterface{

	@Override
	public void funMethod() {
		System.out.println("NonFunctionalMethod");
	}
	
}
