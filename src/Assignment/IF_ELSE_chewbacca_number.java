package Assignment;

import java.util.*;

public class IF_ELSE_chewbacca_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
//double d = sc.nextDouble()	;
//char ch = sc.next().charAt(0);
		long ans = 0;
		long mul = 1;
		while (n > 9) {
			long rem = n % 10;
			long rev = 9 - rem;
			if (rev < rem) {
				ans = ans + rev * mul;
			} else {
				ans = ans + rem * mul;
			}
			mul *= 10;
			n = n / 10;
		}
		if (n == 9 || n-9 >n) {
			ans = ans + n * mul;
		} else {
			long rem = n % 10;
			long rev = 9 - rem;
			ans = ans + rev * mul;
		}
		System.out.print(ans);

	}
}
