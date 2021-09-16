package section10_map.section44_weakhashmap;

public class Temp {

	@Override
	public String toString() {
		return "temp";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method was called.");
		super.finalize();
	}
	
	
	
}
