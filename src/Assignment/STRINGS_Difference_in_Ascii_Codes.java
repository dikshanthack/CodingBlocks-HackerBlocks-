package Assignment;

import java.util.*;

public class STRINGS_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		diff(s);
	}

	public static void diff(String s) {
		String s1 = "";
		int diff = 0;
		for (int i = 0; i < s.length()-1 ; i++) {
			diff = s.charAt(i + 1) - s.charAt(i);
			s1 = s1 + s.charAt(i) + diff ;
		}
		s1 =  s1 + s.charAt(s.length()-1); 
		System.out.println(s1);
	}
}
