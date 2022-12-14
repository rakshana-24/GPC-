package JavaCollections;

import java.util.LinkedHashSet;
import java.util.Random;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Random obj = new Random();
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}
		
		System.out.println("LinkedHashSet elements: " +set);
	}

}
