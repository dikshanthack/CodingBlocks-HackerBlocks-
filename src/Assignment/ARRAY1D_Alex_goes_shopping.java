package Assignment;

import java.util.*;

public class ARRAY1D_Alex_goes_shopping {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		alex_can_buy(arr);
	}

	public static void alex_can_buy(int[] arr) {
	//	Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q > 0) {
			int a = sc.nextInt();
			int k = sc.nextInt();
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (a % arr[i] == 0) {
					count++;
				}
			}
			if (count >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			q--;
		}
	}
}
