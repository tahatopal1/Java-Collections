package section14_generics.section93_rawtype;

import java.util.List;

public class RawTypeApplication {

	public static void main(String[] args) {
		
		Box<Integer> genBox = new Box<Integer>(List.of(1, 2, 3));
		Box rawBox = new Box(List.of(1, 2, "Test"));
		
	}

}
