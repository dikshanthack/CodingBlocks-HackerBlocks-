package Assignment;

import java.util.*;

public class ARRAY1D_Target_Sum_Triplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		target_sum_tripet(arr, target);
	}

	public static void target_sum_tripet(int[] arr, int target) {
		Arrays.sort(arr);
		for (int p = 0; p < arr.length; p++) {
			int i = p + 1;
			int j = arr.length - 1;
			while (i < j) {
				int sum = arr[i] + arr[j] + arr[p];
				if (sum == target) {
					//System.out.println(p);
					System.out.println(arr[p] + ", " + arr[i] + " and " + arr[j]);
					i++;
					j--;
				} else if (sum < target) {
					i++;

				} else {
					j--;
				}
			}
		}
	}

}
