package Assignment;

import java.util.*;

public class ARRAY1D_Max_in_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(max(arr));
	}

	public static int max(int[] arr) {
		int m = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				m = Math.max(m, arr[i]);
			}
		}
		return m;
	}
}
