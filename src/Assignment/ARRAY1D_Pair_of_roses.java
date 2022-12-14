 package Assignment;

import java.util.*;

public class ARRAY1D_Pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			buy_roses(arr, m);
		}
	}

	public static void buy_roses(int[] arr, int m) {
		Arrays.sort(arr);
		int p1 = 0;
		int p2 = 0;
		int i = 0;
		int j = arr.length - 1;
		int diff = Integer.MAX_VALUE;
		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum == m && arr[j] - arr[i] < diff) {
				diff = arr[j] - arr[i];
				p1 = i;
				p2 = j;
				i++;
				j--;
			} else if (sum < m) {
				i++;

			} else {
				j--;
			}

		}
		System.out.println("Deepak should buy roses whose prices are " + arr[p1] + " and " + arr[p2]);

	}
}