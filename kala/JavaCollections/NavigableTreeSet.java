package JavaCollections;

import java.util.TreeSet;

public class NavigableTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);

		System.out.println(s);

		System.out.println(s.ceiling(20));
		System.out.println(s.higher(40));
		System.out.println(s.floor(19));
		System.out.println(s.lower(30));
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s.descendingSet());

	}

}
