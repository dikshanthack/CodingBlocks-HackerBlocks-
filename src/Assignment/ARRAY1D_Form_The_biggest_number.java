package Assignment;

import java.util.*;

public class ARRAY1D_Form_The_biggest_number {

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
			biggest_number(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

	public static void biggest_number(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (compare(arr[i], arr[j]) > 0) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
	public static int compare(int i, int j) {
		String s1 = "" + i + j;
		String s2 = "" + j + i;
		// TODO Auto-generated method stub
		if (Long.parseLong(s2) > Long.parseLong(s1)) {
			return 1;
		} else {
			return -1;
		}
	}
}
