package Assignment;

import java.util.*;

public class STRINGS_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		replace(s);
	}

	public static void replace(String s) {
		int count = 0;
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (count % 2 == 0) {
				s1 = s1 + (char) (ch + 1);
			} else {
				s1 = s1 + (char) (ch - 1);
			}
			count++;
		}
		System.out.println(s1);
	}
}
