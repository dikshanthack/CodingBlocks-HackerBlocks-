package Assignment;

import java.util.*;

public class SORTING_RECURSION_Quick_Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Quick_Sort(arr, 0, arr.length-1 );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Quick_Sort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int idx = Partition(arr, lo, hi);
		Quick_Sort(arr, lo, idx - 1);
		Quick_Sort(arr, idx + 1, hi);
	}

	public static int Partition(int[] arr, int lo, int hi) {
		int pivot = arr[hi];
		int idx = lo;
		for (int i = lo; i < hi; i++) {
			if (arr[i] <= pivot) {
				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx] = t;
				idx++;
			}
		}
		int t = arr[idx];
		arr[idx] = arr[hi];
		arr[hi] = t;
		return idx;
	}
}
