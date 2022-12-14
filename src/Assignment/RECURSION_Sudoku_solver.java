package Assignment;

import java.util.*;

public class RECURSION_Sudoku_solver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] grid = new int[n][n];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		solver(grid, 0, 0);
	}

	public static void solver(int grid[][], int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			display(grid);
			return;
		}

		if (grid[row][col] != 0) {
			solver(grid, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (itis_possible(grid, row, col, val) == true) {
					grid[row][col] = val;
					solver(grid, row, col + 1);
					grid[row][col] = 0;
				}
			}
		}
	}

	public static boolean itis_possible(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		// for col
		int c = 0;
		while (c < 9) {
			if (grid[row][c] == val) {
				return false;
			}
			c++;
		}
		// for rows
		int r = 0;
		while (r < 9) {
			if (grid[r][col] == val) {
				return false;
			}
			r++;
		}
		// for 3*3 matrix
		r = row - row % 3;
		c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}

	public static void display(int grid[][]) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

}
