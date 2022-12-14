package Assignment;

import java.util.*;

public class RECURSION_keypad_game {
	public class keypad_game {
		static String[] key = { " ", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
		static int count = 0;

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			print(s, "");
			System.out.println("\n" + count);
		}

		public static void print(String s, String ans) {
			if (s.length() == 0) {
				System.out.print(ans + " ");
				count++;
				return;
			}

			char ch = s.charAt(0);
			String presskey = key[ch - 48];
			for (int i = 0; i < presskey.length(); i++) {
				print(s.substring(1), ans + presskey.charAt(i));
			}
		}
	}
}
