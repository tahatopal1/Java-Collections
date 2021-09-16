package section8_set.section32_comparabaleandcomparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparableApplication {
	public static void main(String[] args) {
		SortedSet<Member> memberSet = new TreeSet<Member>();
		memberSet.add(new Member("Jack", 1));
		memberSet.add(new Member("Steve", 5));
		memberSet.add(new Member("John", 3));
		memberSet.add(new Member("Lee", 2));
		memberSet.add(new Member("Michael", 9));
		System.out.println(memberSet);
	}
}
