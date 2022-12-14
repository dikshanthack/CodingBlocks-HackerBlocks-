package Assignment;

import java.util.*;

public class ARRAY2D_Transpose_of_a_square_matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}

		transpose(arr);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println( );
		}
	}

	public static void transpose(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {
				int t = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = t;
			}
		}
	}
}
