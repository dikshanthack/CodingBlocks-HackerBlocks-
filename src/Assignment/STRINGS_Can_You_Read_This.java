package Assignment;

import java.util.*;

public class STRINGS_Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		read(s);
	}

	public static void read(String s) {
		String s1 = "";
		s1 = s1 + s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(s1);
				s1 = "";
				s1 = s1 + ch;
			} else {
				s1 = s1 + ch;
			}
		}
		System.out.println(s1);

	}
}