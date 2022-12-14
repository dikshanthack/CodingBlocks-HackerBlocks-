package Assignment;

import java.util.Scanner;

public class ARRAY2D_Wave_Print_Row_Wise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col] + ", ");
				}
			} else {
				for (int col = arr[0].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + ", ");
				}
			}
			
			
		}
		System.out.print("END");
	}
}


