package Assignment;

import java.util.*;

public class RECURSION_Maze_path {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// number of rows.
		int m = sc.nextInt();// number of col.
		System.out.println("\n" + print_path(0, 0, n - 1, m - 1, ""));
	}

	public static int print_path(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			count++;
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int a = print_path(cr + 1, cc, er, ec, ans + "V");
		int b = print_path(cr, cc + 1, er, ec, ans + "H");
		return a + b;
	}
}
