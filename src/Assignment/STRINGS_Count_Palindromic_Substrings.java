package Assignment;

import java.util.*;

public class STRINGS_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (checkpalindrome(s1) == true) {
//					System.out.println(s1);
					count++;
				}
			}
		}
		System.out.println(count);

	}

	public static boolean checkpalindrome(String s1) {
		int i = 0;
		int j = s1.length() - 1;
		while (i < j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}