package Assignment;

import java.util.*;

public class Sqaure_root {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(sroot(n));
	}

	public static long sroot(long n) {
		long lo = 1;
		long hi = n;
		long ans = 0;
		while (lo <= hi) {
			long mid = (int) ((lo + hi) / 2);
			if (mid * mid <=n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return  ans;
	}
}
