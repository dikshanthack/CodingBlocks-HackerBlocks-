package Assignment;

import java.util.*;

public class ARRAY1D_inverse_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = inv(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(ans[i] + " ");
	}

	public static int[] inv(int[] arr) {
		int[] brr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			brr[arr[i]] = i;
		}
		return brr;

	}
}