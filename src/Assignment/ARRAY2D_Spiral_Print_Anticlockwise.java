package Assignment;

import java.util.*;

public class ARRAY2D_Spiral_Print_Anticlockwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		print(arr);
	}

	public static void print(int[][] arr) {
		int min_row = 0;
		int max_row = arr.length - 1;
		int min_col = 0;
		int max_col = arr[0].length - 1;
		int count = 0;
		int total = arr.length * arr[0].length;
		while (count < total) {
			for (int i = min_row; i <= max_row && count < total; i++) {
				System.out.print(arr[i][min_col] + ", ");
				count++;
			}
			min_col++;
			for (int i = min_col; i <= max_col && count < total; i++) {
				System.out.print(arr[max_row][i] + ", ");
				count++;
			}
			max_row--;
			for (int i = max_row; i >= min_row && count < total; i--) {
				System.out.print(arr[i][max_col] + ", ");
				count++;
			}
			max_col--;
			for (int i = max_col; i >= min_col && count < total; i--) {
				System.out.print(arr[min_row][i] + ", ");
				count++;
			}
			min_row++;
		}
		System.out.print("END");
	}

}