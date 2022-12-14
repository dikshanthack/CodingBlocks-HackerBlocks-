package Assignment;

import java.util.Scanner;

public class RECURSION_all_indexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] ans = first_index(arr, 0, m, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] first_index(int[] arr, int i, int m, int count) {
		if (i == arr.length) {
			int[] ans = new int[count];
			return ans;
		}

		if (arr[i] == m) {
			//System.out.print(i + " ");
			int[] ans = first_index(arr, i+1, m, count + 1);
			ans[count] = i;
			return ans;

		} else
			return first_index(arr, i + 1, m, count);

	}
}