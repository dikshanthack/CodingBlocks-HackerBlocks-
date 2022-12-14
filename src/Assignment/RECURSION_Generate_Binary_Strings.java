package Assignment;

import java.util.*;

public class RECURSION_Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			generate_String(s, "");
			System.out.println();

		}
	}
	public static void generate_String(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (s.charAt(0) == '?') {
			generate_String(s.substring(1), ans + 0);
			generate_String(s.substring(1), ans + 1);
		} else {
			generate_String(s.substring(1), ans+s.charAt(0));
		}

	}
}
