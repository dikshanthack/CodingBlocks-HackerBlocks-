package Assignment;

import java.util.*;

public class ARRAY2D_Rotate_image {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}

		Transpose(arr);
		reverse(arr);
//		Transpose(arr);
//		reverse(arr);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static void Transpose(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {
				int t = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = t;
			}
		}
	}
	public static void reverse(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {
			int i = 0;
			int j = arr.length - 1;
			while (i < j) {
				int t = arr[i][col];
				arr[i][col] = arr[j][col];
				arr[j][col] = t;
				i++;
				j--;
			}
		}
	}
}
