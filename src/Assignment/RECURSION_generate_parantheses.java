package Assignment;

import java.util.*;

public class RECURSION_generate_parantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n, 0, 0, "");
	}

	public static void print(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open < n) {
			print(n, open + 1, close, ans + "(");

		}
		if (close < open) {
			print(n, open, close + 1, ans + ")");
		}
	}
}
