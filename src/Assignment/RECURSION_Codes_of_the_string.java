package Assignment;

import java.util.*;

public class RECURSION_Codes_of_the_string {
	static String[] ch = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
			"s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> list = new ArrayList<>();
		print(s, "", list);
		System.out.print(list);

	}

	public static void print(String s, String ans, List<String> list) {
		if (s.length() == 0) {
			list.add(ans);
			return;
		}
		char ch1 = s.charAt(0);
		String Presskey = ch[ch1 - '1'];
		print(s.substring(1), ans + Presskey, list);
		if (s.length() >= 2) {
			int n = Integer.parseInt(s.substring(0, 2));
			if (n > 0 && n <= 26) {
				print(s.substring(2), ans + ch[n - 1], list);

			}

		}

	}
}