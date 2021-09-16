package section14_generics.section89_genericsintro;

public class Application {

	public static void main(String[] args) {
		
		Data<String> d1 = new Data<>("d1");
		
		// Data<Integer> d2 = new Data<>("d1"); ->Not valid
		Data<Integer> d2 = new Data<>(15);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
	}

}
