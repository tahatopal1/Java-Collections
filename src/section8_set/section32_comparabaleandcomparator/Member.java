package section8_set.section32_comparabaleandcomparator;

public class Member implements Comparable<Member> {

	private String name;
	private int id;
	
	public Member() { }
	
	public Member(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.getName();
	}
	
	@Override
	public int compareTo(Member o) {
		return (this.id > o.id ? 1 : (this.id < o.id ? -1 : 0));
	}

}
