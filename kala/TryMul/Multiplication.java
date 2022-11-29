package Practice;

public class Multiplication {
	static int arr[] = {1, 2, 3, 4};
	
	static int multiply() {
		int sum = 1;
		for(int i = 0; i <= arr.length; i++) {
			sum = sum * arr[i];
		}
		 return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(multiply());
	}
}
