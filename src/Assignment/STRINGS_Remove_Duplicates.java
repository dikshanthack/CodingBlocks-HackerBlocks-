package Assignment;

import java.util.*;

public class STRINGS_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		remove(s);
	}

	public static void remove(String s) {
		String s1 = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				s1 = s1 + s.charAt(i);
			}
		}
		s1 = s1 + s.charAt(s.length() - 1);
		System.out.println(s1);
	}

}
