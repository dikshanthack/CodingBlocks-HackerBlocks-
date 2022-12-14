package Assignment;

import java.util.*;

public class RECURSION_replace_all_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String ans = "" + s.charAt(0);
			replace(s.substring(1), ans);
		}
	}

	public static void replace(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		if (s.charAt(0) == 'i' && ans.charAt(ans.length() - 1) == 'p') {
			replace(s.substring(1), ans.substring(0, ans.length() - 1) + 3.14);
		} else {
			replace(s.substring(1), ans + s.charAt(0));
		}
	}
}
