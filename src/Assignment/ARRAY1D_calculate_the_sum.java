package Assignment;

import java.util.*;

public class ARRAY1D_calculate_the_sum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		calculate(arr, n);
	}

	public static void calculate(int[] arr, int n) {
		int q = sc.nextInt();
		while (q-- > 0) {
			int x = sc.nextInt();
			int[] brr = new int[arr.length];
			for (int i = 0; i < brr.length; i++) {
				int j = i - x;
				if (j < 0) {
					j += n;
				}
				brr[i] = arr[i] + arr[j];
			}
			arr = brr;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}