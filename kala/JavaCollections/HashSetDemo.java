package JavaCollections;
import java.util.HashSet;
import java.util.Random;
public class HashSetDemo {
	public static void main(String[] args) {
		Random obj = new Random();
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}
		
		System.out.println("HashSet Elements" +set);
		
	}
}
