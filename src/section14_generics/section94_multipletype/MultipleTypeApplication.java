package section14_generics.section94_multipletype;

public class MultipleTypeApplication {
	public static void main(String[] args) {
		Bin<String, Integer> bin = new Bin<String, Integer>();
		bin.setDryTrash("Dry Trash");
		bin.setWetTrash(15);
		System.out.println("Dry Trash Value: " + bin.getDryTrash());
		System.out.println("Wet Trash Value: " + bin.getWetTrash());
	}
}
