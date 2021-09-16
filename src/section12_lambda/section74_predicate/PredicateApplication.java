package section12_lambda.section74_predicate;

import java.util.function.Predicate;

public class PredicateApplication {

	public static void main(String[] args) {
		
		int salary = 300;
		
		// Using standart version
		boolean result = salaryCheck(salary);
		System.out.println(result);
		
		// Using predicate
		Predicate<Integer> p = sal -> sal >= 4000;
		result = p.test(salary);
		System.out.println(result);
		
	}

	// Standart Version
	private static boolean salaryCheck(int salary) {
		if (salary >= 4000) {
			return true;
		}else
			return false;
	}

}
