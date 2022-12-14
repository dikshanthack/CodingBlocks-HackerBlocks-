package Assignment;

import java.util.*;

public class ARRAY1D_Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-- >0) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		
		}
		int[] brr = new int[m];
		for (int j = 0; j < brr.length; j++) {
			brr[j] = sc.nextInt();
		}
		System.out.println(addition(arr, brr));
	}
	}

	public static int addition(int[] arr, int[] brr) {
		int i = 0;
		int j = 0;
		int s1 = 0;// arr start
		int s2 = 0;// brr start
		int ans = 0;
		while (i < arr.length && j < brr.length) {
			if (arr[i] < brr[j]) {
				i++;
			} else if (arr[i] > brr[j]) {
				j++;
			} else {
				int sum1 = 0;
				for (int k = s1; k <= i; k++) {
					sum1 += arr[k];
				}
				int sum2 = 0;
				for (int k = s2; k <= j; k++) {
					sum2 += brr[k];
				}
				ans = ans + Math.max(sum1, sum2);
				i++;
				j++;
				s1 = i;
				s2 = j;
			}
		}

		int sum1 = 0;
		for (int k = s1; k <= arr.length-1; k++) {
			sum1 += arr[k];
		}
		int sum2 = 0;
		for (int k = s2; k < brr.length-1; k++) {
			sum2 += brr[k];
		}
		ans = ans + Math.max(sum1, sum2);
		return ans;
	}
}
