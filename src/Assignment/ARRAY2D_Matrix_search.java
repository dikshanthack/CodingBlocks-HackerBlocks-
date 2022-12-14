package Assignment;

import java.util.*;

public class ARRAY2D_Matrix_search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		int item = sc.nextInt();
		System.out.println(M_search(arr, item));
	}

	public static int M_search(int[][] arr, int item) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] == item) {
					return 1;
				}
			}
		}
		return 0;
	}
}
