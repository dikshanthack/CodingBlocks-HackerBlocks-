package Assignment;

import java.util.*;

public class ARRAY1D_minimum_in_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int[] arr = {89,-19,-605,89,52,6,-102,-502};
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		System.out.println(minimum(arr));
		System.out.println(minimum1(arr));
		System.out.println(minimum2(arr));
	}

	public static int minimum(int[] arr) {
		int m = arr[0];
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] < m) {
				m = arr[i];
			}
		}
		return m;
	}

	public static int minimum1(int[] arr) {
		int m = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < m) {
				m = arr[i];
			}
		}
		return m;
	}
	public static int minimum2(int[] arr) {
		int m = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < m) {
				m = Math.min(m, arr[i]);
			}
		}
		return m;
	}
}
