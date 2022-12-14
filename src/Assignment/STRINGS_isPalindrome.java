package Assignment;

import java.util.*;

public class STRINGS_isPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(is_palindrome(s));
	}

	public static boolean is_palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}
		return true;

	}
}
