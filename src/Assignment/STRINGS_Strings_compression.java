package Assignment;

import java.util.*;

public class STRINGS_Strings_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		comression(s);
	}

	public static void comression(String s) {
		int count = 1;
		String s1 = "";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				s1 = s1 + s.charAt(i);
				if (count > 1) {
					s1 = s1 + count;
				}
				count = 1;

			}
		}
		s1 = s1 + s.charAt(s.length() - 1);
		if (count > 1) {
			s1 = s1 + count;
		}
		System.out.println(s1);

	}

}
