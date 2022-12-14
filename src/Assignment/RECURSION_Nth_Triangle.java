package Assignment;

import java.util.*;

public class RECURSION_Nth_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(print(n));
	}

	public static int print(int n) {
		if (n == 1) {
			return 1;
		}
		int m = n + print(n - 1);
		return m;
	}
}
