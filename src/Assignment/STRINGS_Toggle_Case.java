package Assignment;

import java.util.*;

public class STRINGS_Toggle_Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		toggle(s);
	}

	public static void toggle(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				s1 = s1 + (char) (ch + 32);
			} else {
				s1 = s1 + (char) (ch - 32);
			}
		}
		System.out.println(s1);
	}
}
