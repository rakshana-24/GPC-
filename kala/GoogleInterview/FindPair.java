package GoogleInterview;

public class FindPair {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int sum = 8;
		findpairs(arr, sum);
	}
	
	public static void findpairs(int[] arr, int sum) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum)
					System.out.println(arr[i] + "+" +arr[j] + "=" + sum);
				else
					System.out.println("No pairs found");
			}
		}
	}
}
