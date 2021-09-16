package section12_lambda.section79_doublecolonconstructor;

public class ConstructorReferenceApplication {

	public static void main(String[] args) {
		Details details = Student :: new;
		Student student = details.getStudent("John");
		System.out.println("Name: " + student.getName());
	}

}

class Student{
	
	private String name;
	
	Student(String name){
		this.name = name;
		System.out.println(name + " is successfully enrolled!");
	}

	public String getName() {
		return name;
	}
	
}

@FunctionalInterface
interface Details{
	public Student getStudent(String name);
}
