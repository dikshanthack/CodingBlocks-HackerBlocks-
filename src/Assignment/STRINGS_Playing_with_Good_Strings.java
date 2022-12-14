package Assignment;

import java.util.*;

public class STRINGS_Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(read(s));
	}

	public static int read(String s) {
		int ans = 0;
		int count = 0;
	 	for (int i = 0; i <= s.length()-1; i++) {
			char ch = s.charAt(i);
			if (isvowel(ch) == true) {
				count++;
			} else {
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		ans = Math.max(ans, count);
		return ans;
	}

	public static boolean isvowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}