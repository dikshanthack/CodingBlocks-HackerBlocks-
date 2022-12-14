package Assignment;

import java.util.*;

public class SORTING_RECURSION_Merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = sc.nextInt();
		}
		int[] arr = mergesort(ans,0, ans.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] mergesort(int[] ans, int lo, int hi) {
		if (lo == hi) {
			int[] a = new int[1];
			a[0] = ans[lo];
			return a;
		}

		int mid = (lo + hi) / 2;

		int[] fs = mergesort(ans, lo, mid);
		int[] ss = mergesort(ans, mid + 1, hi);
		return sorted_array(fs, ss);

	}

	public static int[] sorted_array(int[] arr, int[] brr) {
		int n = arr.length;
		int m = brr.length;
		int[] ans = new int[n + m];
		int i = 0;// arr
		int j = 0;// brr
		int k = 0;// ans

		while (i < n && j < m) {
			if (arr[i] <= brr[j]) {
				ans[k] = arr[i];
				k++;
				i++;
			} else {
				ans[k] = brr[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr[i];
			k++;
			i++;
		}
		while (j < m) {
			ans[k] = brr[j];
			k++;
			j++;
		}
		return ans;
	}
}
