package GoogleInterview;
import java.util.HashMap;
import java.util.Map;
public class FindPairUsingHash {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4};
		findPair(a, 8);
	}
	
	public static void findPair(int a[], int k ) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < a.length; i++) {
			if(pairs.containsKey(a[i]))
				System.out.println(a[i] + "+" +pairs.get(a[i]) + "=" +k);
			else
				pairs.put(k - a[i], a[i]);
		}
		
	}
}
