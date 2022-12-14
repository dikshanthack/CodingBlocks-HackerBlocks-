package Assignment;

import java.util.*;

public class STRINGS_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		max(s);
	}

	public static void max(String s) {
		int count = 1;
		int ans = 0;
		char max_ch = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				char ch1 = s.charAt(j);
				if (ch == ch1) {
					count++;
				}
			}
			if (ans < count) {
				ans = count;
				max_ch = ch;
			}
			count = 1;
		}
		System.out.println(max_ch);

	}
}