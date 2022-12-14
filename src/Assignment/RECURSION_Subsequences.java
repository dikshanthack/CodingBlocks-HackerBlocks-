package Assignment;
import java.util.*;
public class RECURSION_Subsequences {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		print(s, "");
		System.out.print("\n" + count);
	}

	public static int print(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans+" ");
			count++;
			return 1;
		}
		char ch = s.charAt(0);
		int a = print(s.substring(1), ans);
		int b = print(s.substring(1), ans + ch);
		return a + b;
	}
}
