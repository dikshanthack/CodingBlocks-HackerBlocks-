package Assignment;

import java.util.*;
public class RECURSION_board_path {
 static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("\n" + print(0,n, m, ""));
	}

	public static int print(int curr, int end, int m,String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= m; dice++) {
			count = count + print(curr + dice, end, m, ans + dice);// for n number of times
		}
		return count;
	}
}