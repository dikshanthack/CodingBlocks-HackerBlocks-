package Assignment;

import java.util.*;

public class ARRAY1D_Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(search(arr, m));
	}

	public static int search(int[] arr, int m) {
		int n = arr.length;
		int lo = 0;
		int hi = arr.length - 1;
		for (int i=lo;i<hi;i++) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == m) {
				return mid;
			} 
			else if (arr[mid] < m) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		return -1;

	}
}
