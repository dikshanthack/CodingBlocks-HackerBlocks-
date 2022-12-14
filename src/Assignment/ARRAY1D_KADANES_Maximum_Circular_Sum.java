package Assignment;

import java.util.*;

public class ARRAY1D_KADANES_Maximum_Circular_Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(max_sum(arr));
		}
	}

	public static int kadanes(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum = curr_sum + arr[i];
			ans = Math.max(curr_sum, ans);
			if (curr_sum < 0) {
				curr_sum = 0;
			}
		}
		return ans;

	}

	public static int max_sum(int[] arr) {
		int lsum = kadanes(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = (-1) * arr[i];
		}
		sum += kadanes(arr);
		return Math.max(lsum, sum);
	}
}
