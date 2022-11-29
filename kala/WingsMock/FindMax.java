package MaxNumber;

import java.util.Scanner;

public class FindMax {
	
	static int minsubarraysum(int a[], int n) {
		int min_sum = Integer.MAX_VALUE;
		int curr_sum = 0;
		for(int i =0; i <=n; i++) {
			curr_sum = curr_sum + a[i];
			if(curr_sum < min_sum)
				min_sum = curr_sum;
			if(curr_sum > 0)
				curr_sum = 0;
		}
		
		return min_sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array range: ");
		int n = sc.nextInt();
		System.out.println("Enter the array values: ");
		int a[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		int min_sum = minsubarraysum(a, n);
		int ans = sum + (min_sum * (-2));
		System.out.println(ans);
	}

}
