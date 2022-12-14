package Assignment;

public class KADANES_ALGO {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(max_sub_array(arr));
	}

	public static int max_sub_array(int[] arr) {
		int n = arr.length;
		 int ans = Integer.MIN_VALUE;// integer ki range min sabse min yei hota hain
		int prev_sum = 0;
		for (int i = 0; i < n; i++) {
			prev_sum += arr[i];
			if (prev_sum < 0) {
				prev_sum = 0;
			}
			ans = Math.max(ans, prev_sum);
		}

		return ans;
	}
}