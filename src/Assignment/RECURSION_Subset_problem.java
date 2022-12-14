package Assignment;

import java.util.*;

public class RECURSION_Subset_problem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println("\n"+print_subset(arr, 0, m, "", 0));

	}

	public static int print_subset(int[] arr, int i, int m, String ans, int sum) {
		if (i == arr.length) {
			if (sum == m) {
				System.out.print(ans+" ");
				return 1;
			}
			return 0;
		}
		int a = print_subset(arr, i + 1, m, ans + arr[i] + " ", sum + arr[i]);
		int b = print_subset(arr, i + 1, m, ans, sum);

		return a + b;

	}
}
