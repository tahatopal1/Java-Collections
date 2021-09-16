package section13_streams.section87_parallelstreams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamApplication {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		long a, b;
		
		for (int i = 0; i < 9999999; i++) {
			employees.add(new Employee("John", 50000));
			employees.add(new Employee("Jack", 4000));
			employees.add(new Employee("Michael", 5000));
			employees.add(new Employee("Tom", 8000));
			employees.add(new Employee("Robert", 2000));
			employees.add(new Employee("Anthony", 2500));
			employees.add(new Employee("Justin", 15000));
		}
		
		// Sequencial stream
		a = System.currentTimeMillis();
		long count = employees.stream().filter(employee -> employee.getSalary() > 5000).count();
		b = System.currentTimeMillis();
		
		System.out.println("Time taken by sequencial stream: " + (b - a));
		
		// Parallel stream
		a = System.currentTimeMillis();
		count = employees.parallelStream().filter(employee -> employee.getSalary() > 5000).count();
		b = System.currentTimeMillis();
		
		System.out.println("Time taken by parallel stream: " + (b - a));
	}

}
