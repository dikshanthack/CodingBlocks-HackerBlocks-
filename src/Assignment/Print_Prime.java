package Assignment;

import java.util.*;

public class Print_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		bin_search(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bin_search(int[] arr) {

		for (int j = 0; j < arr.length ; j++) {
			for (int i = j + 1; i < arr.length ; i++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];
				}

			}
		}
	}
}
