package Assignment;

import java.util.*;

public class RECURSION_Rat_cheese {
	static boolean f = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] path = new char[n][m];
		for (int i = 0; i < path.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				path[i][j] = s.charAt(j);
			}
		}
		int[][] arr = new int[n][m];
		Rat_path(path, 0, 0, arr);
		if (f == false) {
			System.out.println("-1");
		}
	}

	public static void Rat_path(char[][] path, int cr, int cc, int[][] arr) {
		int er = path.length;
		int ec = path[0].length;
		if (cr == er - 1 && cc == ec - 1) {
			if (path[cr][cc] == 'O') {
				f = true;
				arr[cr][cc] = 1;
				display(arr);
				arr[cr][cc] = 0;
			}
			return;
		}
		if (cr < 0 || cr >= er || cc < 0 || cc >= ec || path[cr][cc] == 'X') {
			return;
		}
		int[] row = { 0, -1, 0, 1 };
		int[] col = { 1, 0, -1, 0 };
		path[cr][cc] = 'X';
		arr[cr][cc] = 1;
		for (int i = 0; i < row.length; i++) {
			Rat_path(path, cr + row[i], cc + col[i], arr);
		}
		path[cr][cc] = 'O';
		arr[cr][cc] = 0;
	}

	public static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();

		}

	}

}
