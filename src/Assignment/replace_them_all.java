package Assignment;

import java.util.*;

public class replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		long mul = 1;
		if (n==0) {
			ans = 5;
		}
		while (n != 0) {
			long rem = n % 10;
			if (rem == 0) {
				ans = ans + 5 * mul;
			} else {
				ans = ans + rem * mul;
			}
			mul *= 10;
			n /= 10;
		}
		System.out.println(ans);
	}

}
