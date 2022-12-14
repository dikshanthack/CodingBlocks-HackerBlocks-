package Assignment;

import java.util.*;

public class RECURSION_first_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(first_index(arr, 0, m));
	}

	public static int first_index(int[] arr, int i, int m) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == m) {
			return i;
		}
		return first_index(arr, i + 1, m);
	}
}
