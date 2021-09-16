package section14_generics.section94_genericmethods;

import java.util.List;

public class Box {
	
	private List a;

	// Generic constructor
	public <T> Box(List<T> a) {
		super();
		this.a = a;
	}

	public List getA() {
		return a;
	}

	public void setA(List a) {
		this.a = a;
	}
	
	
}
