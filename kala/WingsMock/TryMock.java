package MaxNumber;

public class TryMock {
	static int n = 5;
	static int arr[] = { -5, -3, -1, -2, -4 };
	static int res = -1001;
	static int max;

	static int Checker(int idx, int arr[]) {
		int max = -1001;
		int l = leftCheck(idx, arr);
		int r = rightCheck(idx, arr);
		if (l > max)
			max = l;

		if (r > max)
			max = r;
		System.out.println(max);
		return max;
	}

	static int leftCheck(int idx, int arr[]) {
		int sum = 0;
		int i;

		for (i = 0; i < n; i++) {
			if (i < idx)
				sum += (arr[i] * -1);
			else
				sum += (arr[i]);
		}

		return sum;
	}

	static int rightCheck(int idx, int arr[]) {
		int sum = 0;
		int i;

		for (i = 0; i > n; i++) {
			if (i < idx)
				sum += (arr[i] * -1);
			else
				sum += (arr[i]);
		}

		return sum;
	}

	public static void main(String[] args) {
		for (int idx = 0; idx < n; idx++) {
			if (arr[idx] > 0) {
				max = Checker(idx, arr);
				if (res > max)
					res = max;
			}
		}
		System.out.println(res);
	}
}
