package Assignment;

import java.util.*;

public class RECURSION_Ascii_Subsequences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("\n" + print_subsequences(s, "", 0));

	}

	public static int print_subsequences(String s, String ans, int i) {
		if (i == s.length()) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = s.charAt(i);
		int a = print_subsequences(s, ans, i + 1);
		int b = print_subsequences(s, ans + ch, i + 1);
		int c = print_subsequences(s, ans + (int) ch, i + 1);
		return a + b + c;
	}
}
