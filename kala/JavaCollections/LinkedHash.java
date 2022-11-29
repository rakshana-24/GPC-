package JavaCollections;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LinkedHash {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("John", 70);
		map.put("Tom,", 60);
		map.put("Lee", 80);
		map.put("Brad", 90);
		Set<String> KeySet = map.keySet();
		
		System.out.println("Keys: " + KeySet);
	
		Collection<Integer> values = map.values();
		System.out.println("Values:" + values);
		
		for (String key : KeySet) {
			System.out.println("Key:" + key + " Value:" + map.get(key) );
		}
				
	}
}
